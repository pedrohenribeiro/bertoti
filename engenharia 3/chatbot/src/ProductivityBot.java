import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.ArrayList;
import java.util.List;

public class ProductivityBot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;
    private ReminderStrategy reminderStrategy;
    private final List<TaskObserver> observers = new ArrayList<>();

    public ProductivityBot(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
        reminderStrategy = new NoReminderStrategy();
    }

    public void setReminderStrategy(ReminderStrategy reminderStrategy) {
        this.reminderStrategy = reminderStrategy;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String taskDescription) {
        for (TaskObserver observer : observers) {
            observer.onTaskAdded(taskDescription);
        }
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (message_text.startsWith("/addtask")) {
                String task = message_text.replace("/addtask", "").trim();
                if (!task.isEmpty()) {
                    SendMessage message = SendMessage.builder()
                            .chatId(chat_id)
                            .text("Tarefa adicionada: " + task)
                            .build();
                    try {
                        telegramClient.execute(message);
                        notifyObservers(task);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else {
                    SendMessage message = SendMessage.builder()
                            .chatId(chat_id)
                            .text("Por favor, informe a descrição da tarefa após o comando /addtask.")
                            .build();
                    try {
                        telegramClient.execute(message);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            } else if (message_text.startsWith("/reminder")) {
                String reminder = reminderStrategy.getReminderMessage();
                SendMessage message = SendMessage.builder()
                        .chatId(chat_id)
                        .text(reminder)
                        .build();
                try {
                    telegramClient.execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else {
                SendMessage message = SendMessage.builder()
                        .chatId(chat_id)
                        .text("Comando não reconhecido. Use /addtask ou /reminder.")
                        .build();
                try {
                    telegramClient.execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
