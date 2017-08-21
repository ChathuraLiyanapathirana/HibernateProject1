/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.MemberDao;
import java.util.ArrayList;
import model.Member;
import org.hibernate.classic.Session;
import util.HibernateUtil;

/**
 *
 * @author Chathura Buddhika
 */
public class MemberDaoImpl implements MemberDao {

    Session session = null;

    public MemberDaoImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean inserMember(Member member) {
        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateMember(Member member) {
        session.beginTransaction();
        session.update(member);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deleteMember(int id) {
        session.beginTransaction();
        Member member = (Member) session.load(Member.class, id);
        session.delete(member);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Member searchMember(int id) {
        Member member = (Member) session.load(Member.class, id);
        return member;
    }

    @Override
    public ArrayList<Member> viewAllMember() {
        ArrayList<Member> al = (ArrayList<Member>) session.createCriteria(Member.class).list();
        return al;
    }

}
