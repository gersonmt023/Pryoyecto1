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

public class Areas {

    public static double rectángulo(double largo, double ancho) {
        double resultado;
        resultado = largo * ancho;
        return resultado;
    }

    public static double cuadrado(double lado) {
        double resultado;
        resultado = lado * lado;
        return resultado;
    }

    public static double circulo(double radio) {
        double resultado, π;
        π = 3.1416;
        resultado = ((2 * π * radio) * radio) / 2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double lado1, ancho, radio, largo, area, repeticion;
        String figura;
        //for(int h=1;h>=1;h++){

        for (;;) {
            System.out.println("Indique la figura la cual quiera averiguar su area(rectangulo,cuadrado,circulo)");
            figura = datos.next();

            switch (figura) {
                case "rectangulo": {
                    System.out.println("Digite la medida del lado");
                    lado1 = datos.nextInt();
                    System.out.println("Digite la medida del ancho");
                    ancho = datos.nextInt();
                    area = rectángulo(lado1, ancho);
                    System.out.println("El area de la figura es=" + area);
                    System.out.println("Si no desea analizar ninguna otra frigura digute 1, si desea lo contrario digite 2");
                    repeticion = datos.nextInt();
                    if (repeticion <= 1) {
                        System.exit(0);
                    } else {

                        break;
                    }
                }
                case "cuadrado": {
                    System.out.println("Digite la medida de uno de los lados");
                    lado1 = datos.nextInt();
                    area = cuadrado(lado1);
                    System.out.println("El area de la figura es=" + area);
                    System.out.println("Si no desea analizar ninguna otra frigura digute 1, si desea lo contrario digite 2");
                    repeticion = datos.nextInt();
                    if (repeticion <= 1) {
                        System.exit(0);
                    } else {

                        break;
                    }
                }
                case "circulo": {
                    System.out.println("Digite la medida del radio");
                    radio = datos.nextInt();
                    area = circulo(radio);
                    System.out.println("El area de la figura es=" + area);
                    System.out.println("Si no desea analizar ninguna otra frigura digute 1, si desea lo contrario digite 2");
                    repeticion = datos.nextInt();
                    if (repeticion <= 1) {
                        System.exit(0);
                    } else {

                        break;
                    }
                }
            }
        }
    }}


    

