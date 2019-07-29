package com.lhotse.core.team.pojoExcute;

/**
 * Created by Lhotse Team on 7/29/2019.
 */
public class SchoolStackers {

    private String name;
    private int quainty;
    private String bord;
    private int teachersQty;
    private String address;
    private int physicsStudentQty;
    private int classStudents;
    private String principalName;
    private String principalAddress;
    private String schoolOnerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuainty() {
        return quainty;
    }

    public void setQuainty(int quainty) {
        this.quainty = quainty;
    }

    public String getBord() {
        return bord;
    }

    public void setBord(String bord) {
        this.bord = bord;
    }

    public int getTeachersQty() {
        return teachersQty;
    }

    public void setTeachersQty(int teachersQty) {
        this.teachersQty = teachersQty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhysicsStudentQty() {
        return physicsStudentQty;
    }

    public void setPhysicsStudentQty(int physicsStudentQty) {
        this.physicsStudentQty = physicsStudentQty;
    }

    public int getClassStudents() {
        return classStudents;
    }

    public void setClassStudents(int classStudents) {
        this.classStudents = classStudents;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getPrincipalAddress() {
        return principalAddress;
    }

    public void setPrincipalAddress(String principalAddress) {
        this.principalAddress = principalAddress;
    }

    public String getSchoolOnerName() {
        return schoolOnerName;
    }

    public void setSchoolOnerName(String schoolOnerName) {
        this.schoolOnerName = schoolOnerName;
    }

    @Override
    public String toString() {
        return "Name :"+ name+", Quainty : "+quainty+", Bord :"+bord+", TeachersQty : "+teachersQty+", Physics Student Qty : " +
                physicsStudentQty+", classStudents : "+classStudents+", Principal Name :"+principalName+", Principal Address : "+
                principalAddress+", School Oner Name : "+schoolOnerName;}

}
