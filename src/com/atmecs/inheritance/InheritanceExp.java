package com.atmecs.inheritance;

public class InheritanceExp {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSno(1);
        s.setSname("rajesh chaganti");

        System.out.println(s.getSno() + " " + s.getSname());
        System.out.println("Student is : "+s);


        //Student s1 = new Student(1,"koushik");
       // System.out.println(s1);

        StudentAddress address = new StudentAddress("flat-206","telangana","india","50019");
        System.out.println(address);

        Student s3 = new Student();
        s3.setAddressLine1("flat-206");
        s3.setCountry("india");
        s3.setState("telagana");
        s3.setPincode("500019");
        s3.setSno(4);
        s3.setSname("vani");

        System.out.println(s3);
        System.out.println(s3.getCountry());

        Student s4 = new Student("flat-206","telangana","india","50019");
        s4.setSno(5);
        s4.setSname("rajesh ch");

        System.out.println(s4);
        System.out.println(s4.getState());

        Student s5 = new Student("flat-206","telangana","india");
        s5.setSno(5);
        s5.setSname("rajesh ch1");

        System.out.println(s5);
        System.out.println(s5.getCountry());
        System.out.println(s5.getPincode());
        s5.getAddress();

    }
}

class Student extends StudentAddress  {
    private int sno;
    private String sname;
    public Student() {

    }
    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public Student(String addressLine1, String state, String country, String pincode) {
        super(addressLine1, state, country, pincode);
    }

    public Student(String addressLine1, String state, String country) {
        super(addressLine1, state, country);
    }



    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void aaa(){
        System.out.println("i am in aaa method");
    }
}

class StudentAddress {

    private String addressLine1;
    private String state;
    private String country;
    public StudentAddress () {
        System.out.println("i am in student address default contructor");
    }
    @Override
    public String toString() {
        return "SudentAddress{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    private String pincode;

    public StudentAddress(String addressLine1, String state, String country, String pincode) {
        this.addressLine1 = addressLine1;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public StudentAddress(String addressLine1, String state, String country) {
        this.addressLine1 = addressLine1;
        this.state = state;
        this.country = country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void getAddress() {
        System.out.println("AddressLine1 is "+getAddressLine1());
        System.out.println("State is: "+getState());
        System.out.println("country is: "+getCountry());
        System.out.println("pincode is: "+getPincode());
    }

}
