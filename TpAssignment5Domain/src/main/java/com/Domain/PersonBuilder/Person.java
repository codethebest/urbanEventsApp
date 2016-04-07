package com.Domain.PersonBuilder;

import java.util.Date;

/**
 * Created by student on 2016/04/07.
 */
public class Person implements PersonPlan,Address {

    private String name;
    private String surname;
    private String street;
    private String city;
    private String province;
    private String country;
    private int nowMonth,nowYear;
    private String gender;
    private String email;
    private int age;

//    public Person person = new Person();

    //setters
    @Override
    public void setAddress(String street,String city,String province,String country) {
        this.city=city;
        this.province=province;
        this.street =street;
        this.country =country;
    }

    @Override
    public void city(String city) {
        this.city = city;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public void country(String country) {
        this.country = country;
    }

    @Override
    public void setstreet(String streetName) {

    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getAge()
    {
        return age;
    }


    @Override
    public void setDateOfBirth(int year, int month, int day) {

        Date now = new Date();
        nowMonth = now.getMonth()+1;
        nowYear = now.getYear()+1900;
        age = nowYear - year;

        if (month > nowMonth) {
            age--;
        }
        else if (month == nowMonth) {
            int nowDay = now.getDate();

            if (day > nowDay) {
                age--;
            }
        }

    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return getStreet() + getCity() + getProvince() + getCountry();
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet()
    {
        return street;
    }
    public int getMonth() {
        return nowMonth;
    }

    public int getYear() {
        return nowYear;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
