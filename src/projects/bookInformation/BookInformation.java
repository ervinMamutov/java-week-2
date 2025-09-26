package projects.bookInformation;

public class BookInformation {
    public static void main(String[] args) {
        Book bk1 = new Book("James", "Percival Everett", 2025);
        Book bk2 = new Book("All Fours", "Miranda July", 2024);

        bk1.doPrintDetails();
        bk2.doPrintDetails();

    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    protected void doPrintDetails() {
        System.out.println("This book, '" + title + "', was written by " + author + " in " + year);
    }
}




