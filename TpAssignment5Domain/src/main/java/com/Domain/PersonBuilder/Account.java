package com.Domain.PersonBuilder;

/**
 * Created by student on 2016/04/08.
 */
public class Account {

    private String name;
    private String password;
    private String securityQuestion;
    private String getSecurityAnswer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getGetSecurityAnswer() {
        return getSecurityAnswer;
    }

    public void setGetSecurityAnswer(String getSecurityAnswer) {
        this.getSecurityAnswer = getSecurityAnswer;
    }
}