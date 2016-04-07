package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public class MakeUser {
    private UserBuilder userBuilder;

    public MakeUser(){}
    public MakeUser (UserBuilder userBuilder)
    {
        this.userBuilder = userBuilder;
    }

    public Person getPerson()
    {
        return this.userBuilder.getPerson();
    }

    public void make()
    {
        this.userBuilder.buildName();
        this.userBuilder.buildSurname();
        this.userBuilder.buildDateOfBirth();
        this.userBuilder.buildAge();
        this.userBuilder.buildEmail();
        this.userBuilder.buildAddress();
    }
}
