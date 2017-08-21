/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import dao.impl.TransactionDaoImpl;
import junit.framework.Assert;
import model.Transaction;
import model.TransactionDate;
import org.junit.Test;

/**
 *
 * @author Chathura Buddhika
 */
public class TransactionTest {
    
    public TransactionTest() {
    }

    @Test
    public void testAdd(){
        TransactionDate date=new TransactionDate("2312312", "123123123");
        Transaction t=new Transaction();
        t.setTransactionId(1);
        t.setMemberId("1");
        t.setBookId("1");
//        t.setDate(date);
        boolean insertTransaction = new TransactionDaoImpl().insertTransaction(t, date);
        
        Assert.assertEquals(true, insertTransaction);
    }
}
