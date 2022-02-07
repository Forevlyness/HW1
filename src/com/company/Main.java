package com.company;

public class Main {

    public static void main(String[] args) {
	final int num = 2002;
    String word1 = "Мельников";
    String word2 = "Тимур";
    String word3 = "Давидович";
        System.out.println(word1 + word2 + word3 + num);

        if (num < 0) {
            System.out.println("Значение отрицательное число");
        } else if (num == 0) {
            System.out.println("Значение ноль");
        } else {
            System.out.println("Значение положительное число");
        }
    }
}
