package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public class BuildUser implements UserBuilder {

    private Person person;

    public BuildUser()
    {
        this.person = new Person();
    }

    @Override
    public void buildName() {
        person.setName("Liyolo");
    }

    @Override
    public void buildSurname() {
        person.setSurname("Moko");
    }

    @Override
    public void buildDateOfBirth() {
        person.setDateOfBirth(1996,8,12);
    }

    @Override
    public void buildGender() {
        person.setGender("male");
    }

    @Override
    public void buildEmail() {
        person.setEmail("Leo.moko@gmail.com");
    }

    @Override
    public void buildAge() {
        person.getAge();
    }

    @Override
    public void buildAddress() {
        person.getAddress();
    }

    @Override
    public void buildStreetname() {
        person.setstreet("16 Satellite Drive");
    }

    @Override
    public void buildCountry() {
        person.country("South Africa");
    }

    @Override
    public void buildCity() {
        person.city("Cape Town");
    }

    @Override
    public void setProvince() {
        person.setProvince("Western Cape");
    }
    public Person getPerson()
    {
        return this.person;
    }
}
