package com.company;

public class Main {

    public static void main(String[] args) {
        int[] list1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] list2 = { 999, -60, -77, 14, 160, 301 };
        int[] list3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println(printList(list1));
        System.out.println(printList(list2));
        System.out.println(printList(list3));
    }

    public static String printList(int[] intList) {
        int sum = 0;

        for (int j : intList) {
            sum = sum + j;
        }
        return String.valueOf(sum);
    }
}