// Strategy Pattern
interface ReminderStrategy {
    String getReminderMessage();
}

class NoReminderStrategy implements ReminderStrategy {
    @Override
    public String getReminderMessage() {
        return "Nenhum lembrete definido.";
    }
}

class DailyReminderStrategy implements ReminderStrategy {
    @Override
    public String getReminderMessage() {
        return "Lembre-se de verificar suas tarefas diárias!";
    }
}
