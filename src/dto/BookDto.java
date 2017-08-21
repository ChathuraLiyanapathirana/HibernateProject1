/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Chathura Buddhika
 */
public class BookDto {

    private int bookId;
    private String bookName;
    private String auther;
    private String isbn;
    private double price;

    public BookDto() {
    }

    public BookDto(String bookName, String auther, String isbn, double price) {
        this.bookName = bookName;
        this.auther = auther;
        this.isbn = isbn;
        this.price = price;
    }

    public BookDto(int bookId, String bookName, String auther, String isbn, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.auther = auther;
        this.isbn = isbn;
        this.price = price;
    }
    

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
