/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Embeddable;

/**
 *
 * @author Chathura Buddhika
 */
@Embeddable
public class TransactionDate {
    
    private String toDay;
    private String receveDate;

    public TransactionDate() {
    }

    public TransactionDate(String toDay, String receveDate) {
        this.toDay = toDay;
        this.receveDate = receveDate;
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
