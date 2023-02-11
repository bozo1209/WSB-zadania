package com.bozo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().addAnnotatedClass(Book.class).buildSessionFactory();
             BookManager bookManager = new BookManager(factory)){
            System.out.printf("Check (1): %s%n", bookManager.getBooks());

            Book book1 = new Book();
            book1.setTitle("book1");
            book1.setIsbn(1);

            Book book2 = new Book();
            book2.setTitle("book2");
            book2.setIsbn(2);

            Book book3 = new Book();
            book3.setTitle("book3");
            book3.setIsbn(3);

            bookManager.addBook(book1);
            bookManager.addBook(book2);
            bookManager.addBook(book3);

            System.out.printf("Check (2): %s%n", bookManager.getBooks());
            bookManager.getBooks().forEach(book -> System.out.println("title " + book.getTitle()));

//            bookManager.deleteBooks();
        }
    }
}
