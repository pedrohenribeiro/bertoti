package src;

class Gerente implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Gerente recebeu atualização: " + status);
    }
}
