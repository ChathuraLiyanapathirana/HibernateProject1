/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFactory;
import dto.MemberDto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chathura Buddhika
 */
public class MemberArrangePart1 {

    public void memberManageMain() {

        System.out.println("------------------Member Menu------------------");
        System.out.println("1 Add New Member");
        System.out.println("2 View All Members");
        System.out.println("3 Remove Member");
        System.out.println("4 Update Member");
        System.out.println("5 Search Member");
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
                System.out.println("------------------Add Member------------------");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Member Name :");
                String name = scanner.nextLine();
                System.out.print("Member Address :");
                String address = scanner.nextLine();
                System.out.print("Member Telephone :");
                String tel = scanner.nextLine();
                System.out.print("Member Date Of Birth :");
                String dob = scanner.nextLine();
                System.out.println("\n");
                MemberDto dto = new MemberDto(name, address, tel, dob);
                if (ControllerFactory.getControllerFactory().getMemberController().addMember(dto)) {
                    System.out.println("Member Added Successfully!");
                    memberManageMain();
                }
                break;
            case 2:
                System.out.println("------------------Current Member List------------------");
                ArrayList<MemberDto> viewAllMember = ControllerFactory.getControllerFactory().getMemberController().viewAllMember();
                for (MemberDto singleMember : viewAllMember) {
                    System.out.println(singleMember.getMemberId() + "  " + singleMember.getName() + "  " + singleMember.getAddress() + "  " + singleMember.getDob() + "  " + singleMember.getTel());
                }
                memberManageMain();
                break;
            case 3:
                System.out.println("------------------Remove Member------------------");
                System.out.print("Enter Member Id Here :");
                Scanner s = new Scanner(System.in);
                if (ControllerFactory.getControllerFactory().getMemberController().removeMember(s.nextInt())) {
                    System.out.println("Member Removed Successfully!");
                    doStuff(2);
                }
                break;
            case 4:
                System.out.println("------------------Edit Member------------------");
                Scanner s1 = new Scanner(System.in);
                MemberDto memberDto = new MemberDto();
                System.out.print("Enter Editable Member Id Here :");
                memberDto.setMemberId(s1.nextInt());
                System.out.println("Enter Name  :");
                memberDto.setName(s1.nextLine());
                System.out.println("Enter Address  :");
                memberDto.setAddress(s1.nextLine());
                System.out.println("Enter Telephone  :");
                memberDto.setTel(s1.nextLine());
                System.out.println("Enter Date Of Birth  :");
                memberDto.setDob(s1.nextLine());
                if (ControllerFactory.getControllerFactory().getMemberController().editMember(memberDto)) {
                    System.out.println("Member Edited Successfully!");
                    doStuff(2);
                }
                break;
            case 5:
                Scanner s2 = new Scanner(System.in);
                System.out.println("Enter Member Id  :");
                MemberDto findMember = ControllerFactory.getControllerFactory().getMemberController().findMember(s2.nextInt());
                if(findMember != null){
                    System.out.println(findMember.getMemberId()+"   "+findMember.getName()+"   "+findMember.getAddress()+"   "+findMember.getTel()+"   "+findMember.getDob());
                }
            case 99:
                new FunctionForm().doFunction();
                break;
            default:
                System.err.println("No Suitable Function Found!");
                System.err.println("Try Again!");
                memberManageMain();
        }
    }
}
