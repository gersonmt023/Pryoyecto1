/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */
import java.util.Scanner;

public class Monedas {

    public static double residuos(double numer1, double numer2) {
        double resultado;
        resultado = numer1 % numer2;
        return resultado;
    }

    public static double divisiones(double numer1, double numer2) {
        double resultado;
        resultado = numer1 / numer2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Ingrese la cantidad a desglozar");
        num1 = datos.nextDouble();
        num2 = 1000;
        double moneda2 = 500;
        double moneda3 = 100;
        double moneda4 = 10;
        double moneda5 = 5;
        double moneda6 = 1;
        double division1 = (int) divisiones(num1, num2);
        //System.out.println("El resultado es=" + division1);
        double division2 = residuos(num1, num2);
        //resultado int 500
        double division3 = (int) divisiones(division2, moneda2);
        //residuo de 500
        double division4 = residuos(division2, moneda2);
        //System.out.println("El resultado es=" + division);
        // int de 100
        double division5 = (int) divisiones(division4, moneda3);
        //residuos de 100
        double division6 = residuos(division4, moneda3);
        //int de 10
        double division7 = (int) divisiones(division6, moneda4);
        //residuos de 10
        double division8 = residuos(division6, moneda4);
        // int de 5
        double division9 = (int) divisiones(division8, moneda5);
        //residuos de 5
        double division10 = residuos(division8, moneda5);
        //int de 1
        double division11 = (int) divisiones(division10, moneda6);
        double monedas = division1 + division3 + division5 + division7 + division9 + division11;
        System.out.println("Se necesitan un total de " + (int) monedas + " monedas:"
                + (int) division1 + " de 1000, " + (int) division3 + " de 500, " + (int) division5 + " de 100, " + (int) division7
                + " de 10, " + (int) division9 + " de 5, " + (int) division11 + " de 1");

    }
}
