package com.example.phonetrianglesqare.phone;

public class Call {
    public void getCall(int number, int number2, int number3) {
        int[] myArray = new int[10];
        String[][] handbook = new String[][]{
                {"Petrov", String.valueOf(number)},
                {"Sidorov", String.valueOf(number2)},
                {"Putin", String.valueOf(number3)}};
        System.out.println(handbook[1][1]);
    }

}
