import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

public class Main {
    public static void main(String[] args) {
        String botToken = "7904375930:AAHxIQVxok8ahmIWV4KBCtxNlycdx77YbB4";
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            ProductivityBot bot = new ProductivityBot(botToken);

            bot.setReminderStrategy(new DailyReminderStrategy());

            bot.addObserver(new TaskLogger());
            bot.addObserver(new EmailReminder());

            botsApplication.registerBot(botToken, bot);
            System.out.println("ProductivityBot foi inicializado com sucesso!");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
