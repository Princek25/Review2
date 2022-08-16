package com.bridgelabz;

public class HospitalMain {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Hospital hospital = new Hospital();
        Department department = Department.CARDIOLOGY;
        System.out.println(department);

}   }
enum Department{
    ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY;
}


