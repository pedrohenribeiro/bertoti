class Book implements Item {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.println("Livro: " + title + ", Autor: " + author);
    }
}
