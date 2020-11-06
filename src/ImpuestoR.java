/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;

/**
 *
 * @author famil
 */
import java.util.Scanner;



public class ImpuestoR {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double salario;

        String dependientes;
        System.out.println("Indique el número de dependientes a su salario en "
                + "números del 1 al 4, en caso de ser mayor a eso indíquelo mediante la expresión +4");
        dependientes = datos.next();

        switch (dependientes) {
            case "1": {
                System.out.println("Ingrese el monto de su salario");
                salario = datos.nextDouble();
                if (salario > 200000 & salario < 400000) {
                    double impuesto;
                    impuesto = salario * 0.10;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 400000 & salario < 600000) {
                    double impuesto;
                    impuesto = salario * 0.15;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 600000 & salario < 800000) {
                    double impuesto;
                    impuesto = salario * 0.20;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 800000) {
                    double impuesto;
                    impuesto = salario * 0.30;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }

            }
            case "2": {
                System.out.println("Ingrese el monto de su salario");
                salario = datos.nextDouble();
                if (salario > 200000 & salario < 400000) {
                    double impuesto;
                    impuesto = salario * 0.09;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario > 400000 & salario < 600000) {
                    double impuesto;
                    impuesto = salario * 0.135;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario > 600000 & salario < 800000) {
                    double impuesto;
                    impuesto = salario * 0.18;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 800000) {
                    double impuesto;
                    impuesto = salario * 0.27;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }

            }
            case "3": {
                System.out.println("Ingrese el monto de su salario");
                salario = datos.nextDouble();
                if (salario >= 200000 & salario < 400000) {
                    double impuesto;
                    impuesto = salario * 0.07;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                }
                if (salario >= 400000 & salario < 600000) {
                    double impuesto;
                    impuesto = salario * 0.105;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                }
                if (salario >= 600000 & salario < 800000) {
                    double impuesto;
                    impuesto = salario * 0.14;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                }
                if (salario >= 800000) {
                    double impuesto;
                    impuesto = salario * 0.21;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                }

            }
            case "4": {
                System.out.println("Ingrese el monto de su salario");
                salario = datos.nextDouble();
                if (salario > 200000 & salario < 400000) {
                    double impuesto;
                    impuesto = salario * 0.06;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario > 400000 & salario < 600000) {
                    double impuesto;
                    impuesto = salario * 0.09;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario > 600000 & salario < 800000) {
                    double impuesto;
                    impuesto = salario * 0.12;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 800000) {
                    double impuesto;
                    impuesto = salario * 0.18;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }

            }
            case "+4": {
                System.out.println("Ingrese el monto de su salario");
                salario = datos.nextDouble();
                if (salario >= 200000 & salario < 400000) {
                    double impuesto;
                    impuesto = salario * 0.04;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 400000 & salario < 600000) {
                    double impuesto;
                    impuesto = salario * 0.06;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 600000 & salario < 800000) {
                    double impuesto;
                    impuesto = salario * 0.08;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }
                if (salario >= 800000) {
                    double impuesto;
                    impuesto = salario * 0.12;
                    System.out.println("El valor del impuesto a pagar es=" + impuesto);
                    break;
                }

            }

        }

    }
}
