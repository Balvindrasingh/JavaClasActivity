package com.example.books;

public class LibraryApp {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K. Rowling", "978-0-316-76948-1", "Adventure");
        BookView bookView = new BookView();
        BookController bookController = new BookController(book, bookView);

        //initial book details
        bookController.updateView();


        bookController.setBookDetails("Crime and Punishment", "Fydor Dostoevshy", "978-0-06-12460-4", "Fiction");
        bookController.updateView();
    }
}


