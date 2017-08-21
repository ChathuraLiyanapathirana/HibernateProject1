/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.TransactionDto;
import java.util.ArrayList;

/**
 *
 * @author Chathura Buddhika
 */
public interface TransactionController {

    boolean addTransaction(TransactionDto dto);

    ArrayList<TransactionDto> AllTransactions();
}
