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
            book2.setTitle("book2a");
            book2.setIsbn(2);

            Book book3 = new Book();
            book3.setTitle("book3 aaa");
            book3.setIsbn(3);

            Book book4 = new Book();
            book4.setTitle("book4");
            book4.setIsbn(4);

            Book book5 = new Book();
            book5.setTitle("book5");
            book5.setIsbn(5);

            bookManager.addBook(book1);
            bookManager.addBook(book2);
            bookManager.addBook(book3);
            bookManager.addBook(book4);
            bookManager.addBook(book5);

            System.out.printf("Check (2): %s%n", bookManager.getBooks());
            bookManager.getBooks().forEach(book -> System.out.println("title " + book.getTitle()));

//            bookManager.deleteBooks();
        }
    }
}
