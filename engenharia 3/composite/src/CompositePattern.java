public class CompositePattern {
    public static void main(String[] args) {
        // Criar livros
        Item book1 = new Book("Dom Quixote", "Miguel de Cervantes");
        Item book2 = new Book("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Item book3 = new Book("1984", "George Orwell");

        // Criar coleções
        Collection classics = new Collection("Clássicos");
        classics.addItem(book1);
        classics.addItem(book2);

        Collection dystopian = new Collection("Distopias");
        dystopian.addItem(book3);

        // Coleção geral
        Collection library = new Collection("Biblioteca Geral");
        library.addItem(classics);
        library.addItem(dystopian);

        // Mostrar detalhes da biblioteca
        library.showDetails();
    }
}
