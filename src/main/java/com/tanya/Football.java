package com.tanya;

public class Football extends Hobby {
    private int goals;
    private String nameTeam;

    public Football(String nameHobby, int hours, int goals, String nameTeam) {
        super(nameHobby, hours);
        this.goals = goals;
        this.nameTeam = nameTeam;
    }

    @Override
    public String tellAboutHobby() {
        return "Football{" +
                "goals=" + goals +
                ", nameTeam='" + nameTeam + '\'' +
                '}';
    }
}
