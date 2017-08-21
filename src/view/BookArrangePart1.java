/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFactory;
import dto.BookDto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chathura Buddhika
 */
public class BookArrangePart1 {

    public void bookManageMain() {

        System.out.println("------------------Book Menu------------------");
        System.out.println("1 Add New Book");
        System.out.println("2 View All Books");
        System.out.println("3 Remove Book");
        System.out.println("4 Update Book");
        System.out.println("5 Search Book");
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
                System.out.println("------------------Add Book------------------");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Book Name :");
                String name = scanner.nextLine();
                System.out.print("Book Auther :");
                String auther = scanner.nextLine();
                System.out.print("Book ISBN :");
                String isbn = scanner.nextLine();
                System.out.print("Book Price :");
                double price = scanner.nextDouble();
                System.out.println("\n");
                BookDto dto = new BookDto(name, auther, isbn, price);
                if (ControllerFactory.getControllerFactory().getBookController().addBook(dto)) {
                    System.out.println("Book Added Successfully!");
                    bookManageMain();
                }
                break;
            case 2:
                System.out.println("------------------Current Book List------------------");
                ArrayList<BookDto> viewAllBook = ControllerFactory.getControllerFactory().getBookController().viewAllBook();
                for (BookDto singleBook : viewAllBook) {
                    System.out.println(singleBook.getBookId() + "  " + singleBook.getBookName() + "  " + singleBook.getAuther() + "  " + singleBook.getIsbn() + "  " + singleBook.getPrice());
                }
                bookManageMain();
                break;
            case 3:
                System.out.println("------------------Remove Book------------------");
                System.out.print("Enter Book Id Here :");
                Scanner s = new Scanner(System.in);
                if (ControllerFactory.getControllerFactory().getBookController().removeBook(s.nextInt())) {
                    System.out.println("Book Removed Successfully!");
                    doStuff(2);
                }
                break;
            case 4:
                System.out.println("------------------Edit Book------------------");
                Scanner s1 = new Scanner(System.in);
                BookDto bookDto = new BookDto();
                System.out.print("Enter Editable Book Id Here :");
                bookDto.setBookId(s1.nextInt());
                System.out.println("Enter Book Name  :");
                bookDto.setBookName(s1.nextLine());
                System.out.println("Enter Auther  :");
                bookDto.setAuther(s1.nextLine());
                System.out.println("Enter ISBN  :");
                bookDto.setIsbn(s1.nextLine());
                System.out.println("Enter Price  :");
                bookDto.setPrice(s1.nextDouble());
                if (ControllerFactory.getControllerFactory().getBookController().editBook(bookDto)) {
                    System.out.println("Book Edited Successfully!");
                    doStuff(2);
                }
                break;
            case 5:
                System.out.println("------------------Search Book------------------");
                Scanner s2 = new Scanner(System.in);
                System.out.println("Enter Book Id  :");
                BookDto findBook = ControllerFactory.getControllerFactory().getBookController().findBook(s2.nextInt());
                if (findBook != null) {
                    System.out.println(findBook.getBookId() + "   " + findBook.getBookName() + "   " + findBook.getAuther() + "   " + findBook.getIsbn() + "   " + findBook.getPrice());
                }
            case 99:
                new FunctionForm().doFunction();
                break;
            default:
                System.err.println("No Suitable Function Found!");
                System.err.println("Try Again!");
                bookManageMain();
        }
    }
}
