package com.Domain.Events;

/**
 * Created by student on 2016/04/08.
 */
public abstract class CreateEvent {

    private String name ;
    private String description;
    private String location;
    private String entryFee;
    private String EventType;

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public CreateEvent()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(String entryFee) {
        this.entryFee = entryFee;
    }
    public String toString()
    {
        return "Name  " +getName() + "\nEntry Fee  " + getEntryFee()+"\nDescription "+getDescription()+"\nLocation  "+getLocation()+"\nType "+ getEventType() ;
    }
}











