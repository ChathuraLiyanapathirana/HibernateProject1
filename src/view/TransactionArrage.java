/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFactory;
import dto.TransactionDto;
import java.util.Scanner;

/**
 *
 * @author Chathura Buddhika
 */
public class TransactionArrage {

    public void transactionManageMain() {
        System.out.println("------------------Transaction Menu------------------");
        System.out.println("1 Add New Book");
        System.out.println("2 View All Books");
        System.out.println("99 Go To Main Menu");
        System.out.println("\n");
        System.out.print("Enter Action Value  :");
        Scanner scanner = new Scanner(System.in);
        int actionValue = scanner.nextInt();
        doStuff(actionValue);
    }

    private void doStuff(int actionValue) {
        switch (actionValue) {
            case 1:
                System.out.println("------------------Add Transaction------------------");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Member ID :");
                String mId = scanner.nextLine();
                System.out.print("Book ID :");
                String bId = scanner.nextLine();
                System.out.print("ToDay :");
                String toDay = scanner.nextLine();
                System.out.print("Recev Date :");
                String rDay = scanner.nextLine();
                TransactionDto dto = new TransactionDto(mId, bId, toDay, rDay);
                if (ControllerFactory.getControllerFactory().getTransactionController().addTransaction(dto)) {
                    System.out.println("Book Added Successfully!");
                    transactionManageMain();
                }
            default:
                System.err.println("No Suitable Function Found!");
                System.err.println("Try Again!");
        }
    }
}
