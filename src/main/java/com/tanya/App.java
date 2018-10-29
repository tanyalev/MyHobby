package com.tanya;

public class App {
    public static void main(String[] args) {
        Hobby[] hobby = new Hobby[2];
        hobby[0] = new Fishing("fishing", 2, 1, 2.5);
        hobby[1] = new Football("football", 15, 3, "Sumka");

        for(Hobby h:hobby) {
            System.out.println(h.tellAboutHobby());
        }
    }
}
