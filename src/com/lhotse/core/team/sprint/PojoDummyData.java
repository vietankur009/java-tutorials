package com.lhotse.core.team.sprint;

public class PojoDummyData {
    private String phone ;
    private String name ;
    private String email ;
    private String address ;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name :"+ name+", Address : " + address+", Phone : " + phone + ", Email : " + email;
    }
}
