package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public class UserProfile {
    public static void main (String [] args){

        UserBuilder userBuilder = new BuildUser();

        MakeUser makeUser = new MakeUser(userBuilder);

        makeUser.make();

        Person person = makeUser.getPerson();
        System.out.print("Build a user\n");

        System.out.print( "Name :"+ person.getName() + "\nSurname :" + person.getSurname() + "\nAge : "+ person.getAge()
                + "\nEmail: "+ person.getEmail());
    }
}
