/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.MemberDto;
import java.util.ArrayList;

/**
 *
 * @author Chathura Buddhika
 */
public interface MemberController {

    boolean addMember(MemberDto dto);

    boolean editMember(MemberDto dto);

    MemberDto findMember(int id);

    boolean removeMember(int id);

    ArrayList<MemberDto> viewAllMember();
}
