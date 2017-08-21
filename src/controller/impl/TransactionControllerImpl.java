/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.impl;

import controller.TransactionController;
import dao.DaoFactory;
import dto.TransactionDto;
import java.util.ArrayList;
import model.Transaction;
import model.TransactionDate;

/**
 *
 * @author Chathura Buddhika
 */
public class TransactionControllerImpl implements TransactionController {

    @Override
    public boolean addTransaction(TransactionDto dto) {
        TransactionDate date = new TransactionDate(dto.getToDay(), dto.getReceveDate());
        Transaction transaction=new Transaction();
        transaction.setMemberId(dto.getMemberId());
        transaction.setBookId(dto.getBookId());
        return DaoFactory.getDaoFactory().getTransactionDao().insertTransaction(transaction, date);
    }

    @Override
    public ArrayList<TransactionDto> AllTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
