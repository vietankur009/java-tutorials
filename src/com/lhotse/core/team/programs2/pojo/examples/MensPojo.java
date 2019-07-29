package com.lhotse.core.team.programs2.pojo.examples;

/**
 * Created by Lhotse Team on 7/28/2019.
 */
public class MensPojo {

    int age;
    String name;
    String mobileNo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString(){
        return "Age is :"+ age+", Name : "+name+", mobile number :"+mobileNo;
    }
}
