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
public class TransactionDto {

    private int transactionId;
    private String memberId;
    private String bookId;
    private String toDay;
    private String receveDate;

    public TransactionDto() {
    }

    public TransactionDto(String memberId, String bookId, String toDay, String receveDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.toDay = toDay;
        this.receveDate = receveDate;
    }

    public TransactionDto(int transactionId, String memberId, String bookId, String toDay, String receveDate) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.toDay = toDay;
        this.receveDate = receveDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getToDay() {
        return toDay;
    }

    public void setToDay(String toDay) {
        this.toDay = toDay;
    }

    public String getReceveDate() {
        return receveDate;
    }

    public void setReceveDate(String receveDate) {
        this.receveDate = receveDate;
    }
}
