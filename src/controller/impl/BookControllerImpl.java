/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.impl;

import controller.BookController;
import dao.DaoFactory;
import dto.BookDto;
import java.util.ArrayList;
import model.Book;

/**
 *
 * @author Chathura Buddhika
 */
public class BookControllerImpl implements BookController {

    @Override
    public boolean addBook(BookDto dto) {
        Book book = new Book();
        book.setBookName(dto.getBookName());
        book.setAuther(dto.getAuther());
        book.setIsbn(dto.getIsbn());
        book.setPrice(dto.getPrice());
        return DaoFactory.getDaoFactory().getBookDao().inserBook(book);
    }

    @Override
    public boolean editBook(BookDto dto) {
        Book book = new Book();
        book.setBookId(dto.getBookId());
        book.setBookName(dto.getBookName());
        book.setAuther(dto.getAuther());
        book.setIsbn(dto.getIsbn());
        book.setPrice(dto.getPrice());
        return DaoFactory.getDaoFactory().getBookDao().updateBook(book);
    }

    @Override
    public BookDto findBook(int id) {
        Book sB = DaoFactory.getDaoFactory().getBookDao().searchBook(id);
        BookDto dto = new BookDto(sB.getBookId(), sB.getBookName(), sB.getAuther(), sB.getIsbn(), sB.getPrice());
        return dto;
    }

    @Override
    public boolean removeBook(int id) {
        return DaoFactory.getDaoFactory().getBookDao().deleteBook(id);
    }

    @Override
    public ArrayList<BookDto> viewAllBook() {
        ArrayList<BookDto> dtos = new ArrayList<>();
        ArrayList<Book> viewAllBook = DaoFactory.getDaoFactory().getBookDao().viewAllBook();
        for (Book book : viewAllBook) {
            BookDto bd = new BookDto(book.getBookId(), book.getBookName(), book.getAuther(), book.getIsbn(), book.getPrice());
            dtos.add(bd);
        }
        return dtos;
    }

}
