/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.impl;

import controller.MemberController;
import dao.DaoFactory;
import dto.MemberDto;
import java.util.ArrayList;
import model.Member;

/**
 *
 * @author Chathura Buddhika
 */
public class MemberControllerImpl implements MemberController {

    @Override
    public boolean addMember(MemberDto dto) {
        Member member = new Member();
        member.setName(dto.getName());
        member.setAddress(dto.getAddress());
        member.setTel(dto.getTel());
        member.setDob(dto.getDob());
        return DaoFactory.getDaoFactory().getMemberDao().inserMember(member);
    }

    @Override
    public boolean editMember(MemberDto dto) {
        Member member = new Member();
        member.setMemberId(dto.getMemberId());
        member.setAddress(dto.getAddress());
        member.setName(dto.getName());
        member.setTel(dto.getTel());
        member.setDob(dto.getDob());
        return DaoFactory.getDaoFactory().getMemberDao().updateMember(member);
    }

    @Override
    public MemberDto findMember(int id) {
        Member searchMember = DaoFactory.getDaoFactory().getMemberDao().searchMember(id);
        MemberDto dto = new MemberDto(searchMember.getMemberId(), searchMember.getName(), searchMember.getAddress(), searchMember.getTel(), searchMember.getDob());
        return dto;
    }

    @Override
    public boolean removeMember(int id) {
        return DaoFactory.getDaoFactory().getMemberDao().deleteMember(id);
    }

    @Override
    public ArrayList<MemberDto> viewAllMember() {
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
        ArrayList<Member> MemberModelList = DaoFactory.getDaoFactory().getMemberDao().viewAllMember();
        for (Member singleData : MemberModelList) {
            MemberDto dto = new MemberDto(singleData.getMemberId(), singleData.getName(), singleData.getAddress(), singleData.getTel(), singleData.getDob());
            memberDtos.add(dto);
        }
        return memberDtos;
    }

}
