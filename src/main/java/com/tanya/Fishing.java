package com.tanya;

public class Fishing extends Hobby {
    private int amountDay;
    private double kgDay;

    public Fishing(String nameHobby, int hours, int amountDay, double kgDay) {
        super(nameHobby, hours);
        this.amountDay = amountDay;
        this.kgDay = kgDay;
    }

    @Override
    public String tellAboutHobby() {
        return "Fishing{" +
                "amountDay=" + amountDay +
                ", kgDay=" + kgDay +
                '}';
    }
}
