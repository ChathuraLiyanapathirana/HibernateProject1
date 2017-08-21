/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.impl.BookControllerImpl;
import controller.impl.MemberControllerImpl;
import controller.impl.TransactionControllerImpl;

/**
 *
 * @author Chathura Buddhika
 */
public class ControllerFactory {

    private static ControllerFactory factory;

    private ControllerFactory() {
    }

    public static ControllerFactory getControllerFactory() {
        if (factory == null) {
            factory = new ControllerFactory();
        }
        return factory;
    }

    public MemberController getMemberController() {
        return new MemberControllerImpl();
    }

    public BookController getBookController() {
        return new BookControllerImpl();
    }
    
    public TransactionController getTransactionController() {
        return new TransactionControllerImpl();
    }

}
