package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/07.
 */
public interface Address {

    public void setAddress(String street,String city,String province,String country);
    public void city(String city);
    public void setProvince(String province);
    public void country(String country);
    public void setstreet(String streetName);
}
