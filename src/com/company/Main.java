package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj masę: ");
        Double masa = scan.nextDouble();
        System.out.println("Podaj wzrost: ");
        Double wzrost = scan.nextDouble();

        BmiCounter bmi = new BmiCounter(masa, wzrost);
        bmi.showBMI();

    }
}
