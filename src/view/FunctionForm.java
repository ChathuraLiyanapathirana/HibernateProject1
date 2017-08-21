/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Member;

/**
 *
 * @author Chathura Buddhika
 */
public class FunctionForm {

    public void doFunction() {
        System.out.println("------------------Main Menu------------------");
        System.out.println("1 Member Manage");
        System.out.println("2 Book Manage");
        System.out.println("3 Transaction Manage");
        System.out.println("0 Exit ");
        System.out.println("\n");
        System.out.print("Enter Action Value  :");

        Scanner scanner = new Scanner(System.in);
        int actionValue = scanner.nextInt();

        switch (actionValue) {
            case 1:
                new MemberArrangePart1().memberManageMain();
                break;
            case 2:
                new BookArrangePart1().bookManageMain();
                break;
            case 3:
                new TransactionArrage().transactionManageMain();
                break;
            case 0:
                System.out.println("Please Wait.....");
                System.out.println("Application Shuting Down");
                System.out.println("Good Bye!");
                break;
            default:
                System.err.println("No Suitable Function Found!");
                System.err.println("Try Again!");
                doFunction();
        }
    }
}
