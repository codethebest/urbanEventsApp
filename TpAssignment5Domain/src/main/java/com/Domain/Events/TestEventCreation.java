package com.Domain.Events;

/**
 * Created by student on 2016/04/08.
 */
public class TestEventCreation {
    public static void main(String []args)
    {
        EventTypeFactory typeFactory = new EventTypeFactory();
        CreateEvent event = null;
        String partyType = "P";
        event = typeFactory.eventType(partyType);

        System.out.print(event.toString());
    }
}
