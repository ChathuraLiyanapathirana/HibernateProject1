/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Transaction;
import model.TransactionDate;

/**
 *
 * @author Chathura Buddhika
 */
public interface TransactionDao {
    
    boolean insertTransaction(Transaction t,TransactionDate date);
}
