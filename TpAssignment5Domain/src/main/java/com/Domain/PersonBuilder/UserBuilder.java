package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public interface UserBuilder{
    public void buildName();
    public void buildSurname();
    public void buildDateOfBirth();
    public void buildGender();
    public void buildEmail();
    public void buildAge();
    public void buildAddress();
    public void buildStreetname();
    public void buildCountry();
    public void buildCity();
    public void setProvince();
    public Person getPerson();

}
