class EmailReminder implements TaskObserver {
    @Override
    public void onTaskAdded(String taskDescription) {
        System.out.println("Email enviado: Você adicionou a tarefa - " + taskDescription);
    }
}
