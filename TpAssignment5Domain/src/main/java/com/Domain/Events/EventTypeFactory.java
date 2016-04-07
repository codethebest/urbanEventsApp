package com.Domain.Events;

/**
 * Created by student on 2016/04/08.
 */
public class EventTypeFactory {

    public CreateEvent eventType(String newEventType)
    {
        if (newEventType.equals("P"))
        {
            return new PoolParty();
        }
        else
        {
            return new Wedding();
        }
    }
}
