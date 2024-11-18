public class SingletonPattern {

    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();

        logger.log("Aplicação iniciada");
        logger.log("Processando os dados");
        logger.log("Aplicação finalizada!");
    }

}