package com.bred_it.bred_it_assessment;

public class Question3 {
    public int process(int amount, int speed, int day) {
        int fallenApplesCount = 0;
        for (int i = 1; i <= day; i++) {
            fallenApplesCount = (fallenApplesCount * speed) + 1;
            if (fallenApplesCount > amount) {
                fallenApplesCount = amount;
                break;
            }
        }
        return (amount - fallenApplesCount);
    }
}
