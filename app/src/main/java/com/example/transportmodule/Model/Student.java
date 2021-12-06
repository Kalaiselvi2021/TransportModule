package com.example.transportmodule.Model;

import java.time.Year;

public class Student {
    public String name, registerNumber, year,department, hosteller, dayscholar, collegebus, privatebus, busnumber, boardingplace, busfees, vaccination, contactnumber,communicationaddress;


    public Student(String name, String registerNumber, String year ,String department, String hosteller, String dayscholar, String collegebus, String privatebus, String busnumber, String boardingplace, String busfees, String vaccination, String contactnumber,String communicationaddress) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.year = year;
        this.department = department;
        this.hosteller = hosteller;
        this.dayscholar = dayscholar;
        this.collegebus = collegebus;
        this.privatebus = privatebus;
        this.busnumber = busnumber;
        this.boardingplace = boardingplace;
        this.busfees = busfees;
        this.vaccination = vaccination;
        this.contactnumber = contactnumber;
        this.communicationaddress = communicationaddress;


    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHosteller() {
        return hosteller;
    }

    public void setHosteller(String hosteller) {
        this.hosteller = hosteller;
    }

    public String getDayscholar() {
        return dayscholar;
    }

    public void setDayscholar(String dayscholar) {
        this.dayscholar = dayscholar;
    }

    public String getCollegebus() {
        return collegebus;
    }

    public void setCollegebus(String collegbus) {
        this.collegebus = collegebus;
    }

    public String getPrivatebus() {
        return privatebus;
    }

    public void setPrivatebus(String privatebus) {
        this.privatebus = privatebus;
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        this.busnumber = busnumber;
    }

    public String getBoardingplace() {
        return boardingplace;
    }

    public void setBoardingplace(String boardingplace) {
        this.boardingplace = boardingplace;
    }

    public String getBusfees() {
        return busfees;
    }

    public void setBusfees(String busfees) {
        this.busfees = busfees;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getCommunicationaddress() {
        return communicationaddress;
    }

    public void setCommunicationaddress(String communicationaddress) {
        this.communicationaddress = communicationaddress;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
}
