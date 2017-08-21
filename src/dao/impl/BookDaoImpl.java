/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.BookDao;
import java.util.ArrayList;
import model.Book;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Chathura Buddhika
 */
public class BookDaoImpl implements BookDao {

    Session session = null;

    public BookDaoImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean inserBook(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateBook(Book book) {
        session.beginTransaction();
        session.update(book);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deleteBook(int id) {
        session.beginTransaction();
        Book book = (Book) session.load(Book.class, id);
        session.delete(book);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Book searchBook(int id) {
        Book book = (Book) session.load(Book.class, id);
        return book;
    }

    @Override
    public ArrayList<Book> viewAllBook() {
        ArrayList<Book> al = (ArrayList<Book>) session.createCriteria(Book.class).list();
        return al;
    }

}
