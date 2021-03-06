package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int attemptsOfPlayer, int number) {
        enteredNumbers[attemptsOfPlayer - 1] = number;
    }

    public int getEnteredNumber(int attemptsOfPlayer) {
        return enteredNumbers[attemptsOfPlayer - 1];
    }

    public int[] getCopyEnteredNumbers(int attemptsOfPlayer) {
        return Arrays.copyOf(enteredNumbers, attemptsOfPlayer - 1);
    }

    public void reset(int attemptsOfPlayer) {
        Arrays.fill(enteredNumbers, 0, attemptsOfPlayer - 1, 0);
    }
}