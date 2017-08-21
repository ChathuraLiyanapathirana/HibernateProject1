/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Member;

/**
 *
 * @author Chathura Buddhika
 */
public interface MemberDao {

    boolean inserMember(Member member);

    boolean updateMember(Member member);

    boolean deleteMember(int id);

    Member searchMember(int id);

    ArrayList<Member> viewAllMember();
}
