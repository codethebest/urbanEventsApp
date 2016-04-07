package com.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/08.
 */
public class TestNotification {

    @Test
    public void TestNotification()throws Exception
    {
        Notification notification = new Notification();
        Assert.assertNotNull(notification);
    }
}
