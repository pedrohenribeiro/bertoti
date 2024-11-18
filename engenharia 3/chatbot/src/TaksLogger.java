class TaskLogger implements TaskObserver {
    @Override
    public void onTaskAdded(String taskDescription) {
        System.out.println("Nova tarefa adicionada: " + taskDescription);
    }
}
