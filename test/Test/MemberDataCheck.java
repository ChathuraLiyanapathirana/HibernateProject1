/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import dao.impl.MemberDaoImpl;
import java.util.ArrayList;
import model.Member;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Chathura Buddhika
 */
public class MemberDataCheck {

    public MemberDataCheck() {
    }

    @Test
    public void testViewAllMember() {

        ArrayList<Member> accept = new ArrayList<>();
        ArrayList<Member> result = new MemberDaoImpl().viewAllMember();

        Assert.assertEquals(accept, result);
    }

    @Test
    public void deleteMember() {
        boolean deleteMember = new MemberDaoImpl().deleteMember(2);
        Assert.assertEquals(true, deleteMember);
    }

    @Test
    public void updateMember() {
        Member member = new Member();
        member.setMemberId(5);
        member.setAddress("Dehiwala");
        member.setName("Kamal");
        member.setTel("787987");
        member.setDob("1993");
        
        boolean updateMember = new MemberDaoImpl().updateMember(member);
        Assert.assertEquals(true, updateMember);
    }
    
    @Test
    public void searchMember(){
        Member searchMember = new MemberDaoImpl().searchMember(5);
        String name = searchMember.getName();
        Assert.assertEquals("Kamal", name);
   }
}
