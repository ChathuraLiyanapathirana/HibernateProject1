/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Chathura Buddhika
 */
@Entity
public class Transaction {
    
    private int transactionId;
    private String memberId;
    private String bookId;
    private TransactionDate date;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public TransactionDate getDate() {
        return date;
    }

    public void setDate(TransactionDate date) {
        this.date = date;
    }
    
}
