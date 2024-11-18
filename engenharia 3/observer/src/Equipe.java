package src;

class Equipe implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Equipe recebeu atualização: " + status);
    }
}
