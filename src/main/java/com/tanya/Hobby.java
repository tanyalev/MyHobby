package com.tanya;

public abstract class Hobby {
    private String nameHobby;
    private int hours;

    public Hobby(String nameHobby, int hours) {
        this.nameHobby = nameHobby;
        this.hours = hours;
    }

    public abstract String tellAboutHobby();
}
