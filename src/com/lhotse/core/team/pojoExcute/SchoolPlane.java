package com.lhotse.core.team.pojoExcute;

import com.lhotse.core.team.programs2.pojo.examples.MensPojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lhotse Team on 7/29/2019.
 */
public class SchoolPlane {
    public static void main (String... arg){
        SchoolStackers priyanka = new SchoolStackers();
        priyanka.setName("Priyanka Modal Scnior secondory School");
        priyanka.setAddress("Near Dhampur Suger Mill (DSM) Distt. Bijnor Uttar Pradesh");
        priyanka.setBord("C.B.S.C Afferated Delhi");
        priyanka.setQuainty(2500);
        priyanka.setPhysicsStudentQty(1500);
        priyanka.setClassStudents(150);
        priyanka.setPrincipalName("Mr. Virendra Chauhan");
        priyanka.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        priyanka.setSchoolOnerName("Mr. Ashok Kumar Rana");
        priyanka.setTeachersQty(53);

        //System.out.println(priyanka);

        /*SchoolStackers[] schoolList = new SchoolStackers[5];
        schoolList[0]=priyanka;*/

        SchoolStackers radha = new SchoolStackers();
        radha.setName("radha inter collage");
        radha.setAddress("Near Sheela takije Dhampur Distt. Bijnor Uttar Pradesh");
        radha.setBord("U.P bord Allahabad");
        radha.setQuainty(2500);
        radha.setPhysicsStudentQty(1500);
        radha.setClassStudents(150);
        radha.setPrincipalName("Mr. Prem Chandra");
        radha.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        radha.setSchoolOnerName("Mr. Radha Chauhan");
        radha.setTeachersQty(53);

        //System.out.println(radha);

        /*schoolList[1]=radha;*/


        SchoolStackers rsm = new SchoolStackers();
        rsm.setName("RSM Inter Collage");
        rsm.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        rsm.setBord("U.P bord Allahabad");
        rsm.setQuainty(2500);
        rsm.setPhysicsStudentQty(1500);
        rsm.setClassStudents(150);
        rsm.setPrincipalName("Mr. XYZ");
        rsm.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        rsm.setSchoolOnerName("Mr. Radha Chauhan");
        rsm.setTeachersQty(53);

        //System.out.println(rsm);

        /*schoolList[2] = rsm;*/


        SchoolStackers km = new SchoolStackers();
        km.setName("KM inter collage");
        km.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        km.setBord("U.P bord Allahabad");
        km.setQuainty(2500);
        km.setPhysicsStudentQty(1500);
        km.setClassStudents(150);
        km.setPrincipalName("Mr. XYZ");
        km.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        km.setSchoolOnerName("Mr. Karodhi mal");
        km.setTeachersQty(53);

        //System.out.println(km);

        /*schoolList[3]= km;*/

        SchoolStackers sentmarry = new SchoolStackers();
        sentmarry.setName("SentMarry School");
        sentmarry.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        sentmarry.setBord("C.B.S.C bord Delhi");
        sentmarry.setQuainty(2500);
        sentmarry.setPhysicsStudentQty(1500);
        sentmarry.setClassStudents(150);
        sentmarry.setPrincipalName("Mr. XYZ");
        sentmarry.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        sentmarry.setSchoolOnerName("Mr. XYZ");
        sentmarry.setTeachersQty(53);

        //System.out.println(sentmarry);

        /*schoolList[4] = sentmarry;*/

        /*for (int i = 0; i <= schoolList.length-1; i = i + 1){
            schoolList[i].getName();
            schoolList[i].getAddress();
            schoolList[i].getBord();
            schoolList[i].getQuainty();
            schoolList[i].getPhysicsStudentQty();
            schoolList[i].getClassStudents();
            schoolList[i].getPrincipalName();
            schoolList[i].getPrincipalAddress();
            schoolList[i].getSchoolOnerName();
            schoolList[i].getTeachersQty();
            System.out.println(schoolList[i].getName()+","+ schoolList[i].getAddress()+","+ schoolList[i].getBord()+","+ schoolList[i].getQuainty()+ "," + schoolList[i].getPhysicsStudentQty()+"," + schoolList[i].getClassStudents()+"," + schoolList[i].getPrincipalName()+","+ schoolList[i].getPrincipalAddress()+","+ schoolList[i].getSchoolOnerName()+ ","+ schoolList[i].getTeachersQty());

        }*/

        ArrayList<SchoolStackers> schoolList1 = new ArrayList<>();
        schoolList1.add(priyanka);
        schoolList1.add(radha);
        schoolList1.add(rsm);
        schoolList1.add(km);
        schoolList1.add(sentmarry);

        //System.out.println(schoolList1);


        Iterator<SchoolStackers> school = schoolList1.iterator();
        while (school.hasNext()) {
            SchoolStackers school1 = school.next();
            System.out.println(schoolList1);
        }
    }


}
