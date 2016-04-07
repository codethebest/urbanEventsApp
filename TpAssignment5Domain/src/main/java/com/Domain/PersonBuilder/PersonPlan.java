package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public interface PersonPlan {

    public void setName(String name);
    public void setSurname(String surname);
    public void setDateOfBirth(int year, int month, int day);
    public int getAge();
    public void setGender(String gender);
    public void setEmail(String email);
}
