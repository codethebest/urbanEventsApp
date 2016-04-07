package com.Domain;

import com.Domain.PersonBuilder.BuildUser;
import com.Domain.PersonBuilder.MakeUser;
import com.Domain.PersonBuilder.Person;
import com.Domain.PersonBuilder.UserBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class TestPersonBuilder {

    @Test
    public void test1()
    {
        Person person = new Person();
        Assert.assertNotNull(person.getAddress());
    }

    @Test
    public void test2()
    {
        UserBuilder userBuilder = new BuildUser();
        Assert.assertNotNull(userBuilder.getPerson());
    }


}
