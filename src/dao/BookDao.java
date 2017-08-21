/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Book;

/**
 *
 * @author Chathura Buddhika
 */
public interface BookDao {

    boolean inserBook(Book book);

    boolean updateBook(Book book);

    boolean deleteBook(int id);

    Book searchBook(int id);

    ArrayList<Book> viewAllBook();
}
