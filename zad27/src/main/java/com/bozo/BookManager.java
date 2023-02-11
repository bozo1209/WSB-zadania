package com.bozo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class BookManager implements AutoCloseable {

    private final Session session;

    public BookManager(SessionFactory factory) {
        this.session = factory.openSession();
    }

    public List<Book> getBooks(){
        return session.createQuery("FROM Book", Book.class).list();
    }

    public Optional<Book> getBook(int isbn){
        return Optional.ofNullable(session.find(Book.class, isbn));
    }

    public void addBook(Book book){
        session.getTransaction().begin();
        System.out.println("1");
        Optional<Book> book1 = getBook(book.getIsbn());
        if (book1.isPresent()){
            System.out.println("2");
            book1.get().setTitle(book.getTitle());
            session.update(book1.get());
            session.getTransaction().commit();
            return;
        }
        System.out.println("3");
        session.save(book);
        System.out.println("4");
        session.getTransaction().commit();
    }

    public void deleteBooks(){
        session.getTransaction().begin();
        session.createQuery("DELETE FROM Book").executeUpdate();
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public void close() {
        if (session != null) {
            session.close();
        }
    }
}
