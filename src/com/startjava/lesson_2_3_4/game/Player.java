package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }
}