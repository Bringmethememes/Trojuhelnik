package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadajte cislo");
        Scanner scr = new Scanner(System.in);
        String dlzka = scr.nextLine();

        int a = Integer.parseInt(dlzka);
        for (int i = 1;i<=a; i++)
        {
            for (int ii = 1; ii <= i; ii++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1;i<=a; i++)
        {
            for (int ii = i; ii <= a; ii++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1;i<=a; i++)
        {
            for (int ii = i; ii<=a;ii++)
            {
                System.out.print(" ");
            }
            for (int ii = 1; ii<=i;ii++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1;i<=a; i++)
        {
            for (int ii = 1; ii<=i;ii++)
            {
                System.out.print(" ");
            }
            for (int ii = i; ii<=a;ii++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
