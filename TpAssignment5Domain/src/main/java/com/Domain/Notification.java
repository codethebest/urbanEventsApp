package com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Notification {
    private static Notification ourInstance = new Notification();

    public Notification() {
    }

    public static Notification getInstance()
    {
        if (ourInstance == null)
            ourInstance = new Notification();

        return ourInstance;
    }


}
