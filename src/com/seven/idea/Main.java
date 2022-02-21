package com.seven.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 20;
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива: ");

        int size = input.nextInt();
        int [] abc = new int[size];
        System.out.println("Данные для массива: ");

        for (int i = 0; i < abc.length; i++) {
            abc[i] = input.nextInt();
            if (abc[i] == x | abc[i] == y | abc[i] == z )
                System.out.println("Данное значение имеется в константах");

        }
    }
}
