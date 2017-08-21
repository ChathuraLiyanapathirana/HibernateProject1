/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.impl.BookDaoImpl;
import dao.impl.MemberDaoImpl;
import dao.impl.TransactionDaoImpl;

/**
 *
 * @author Chathura Buddhika
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getDaoFactory() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public MemberDao getMemberDao() {
        return new MemberDaoImpl();
    }

    public BookDao getBookDao() {
        return new BookDaoImpl();
    }
    
    public TransactionDao getTransactionDao() {
        return new TransactionDaoImpl();
    }
}
