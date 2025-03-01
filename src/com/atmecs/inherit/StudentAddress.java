package com.atmecs.inherit;

public class StudentAddress {

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

    public void bbb() {
        System.out.println("i am in bbb method");
    }

}
