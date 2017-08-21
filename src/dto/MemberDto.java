/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Chathura Buddhika
 */
public class MemberDto {

    private int memberId;
    private String name;
    private String address;
    private String tel;
    private String dob;

    public MemberDto() {
    }

    public MemberDto(String name, String address, String tel, String dob) {

        this.name = name;
        this.address = address;
        this.tel = tel;
        this.dob = dob;
    }

    public MemberDto(int memberId, String name, String address, String tel, String dob) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.dob = dob;
    }
    

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
