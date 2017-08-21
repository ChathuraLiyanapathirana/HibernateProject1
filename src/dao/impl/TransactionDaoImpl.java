/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.TransactionDao;
import model.Transaction;
import model.TransactionDate;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Chathura Buddhika
 */
public class TransactionDaoImpl implements TransactionDao {

    Session session = null;

    public TransactionDaoImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean insertTransaction(Transaction t, TransactionDate date) {
        t.setDate(date);
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        return true;
    }

}
