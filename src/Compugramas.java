/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */


public class Compugramas {

    public static void main(String[] args) {

        int n = 5;
        for (int h = 0; h < n; h++) {
            for (int i = 0; i < n; i++) {
                System.out.print("-");
            }
            System.out.print(">");
            System.out.println(" ");
        }
        System.out.println("Flecha simple");
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }

        System.out.print(">");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
        for (int i = 0; i < n - 2; i++) {
            System.out.println("*       *");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
        //System.out.print(" ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* ");
            for (int hi = 0; hi < i; hi++) {
                System.out.print("  ");
            }
            System.out.print("*");
            if (i == 2) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("   ");
            }
            if (i == 0) {
                System.out.print("     ");
            }
            System.out.println("*");
        }
        //System.out.println(" ");

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

    }
}



