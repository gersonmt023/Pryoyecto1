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

public class CalculadoraProyecto1 {

    public static double sumas(double numer1, double numer2) {
        double resultado;
        resultado = numer1 + numer2;
        return resultado;
    }

    public static double restas(double numer1, double numer2) {
        double resultado;
        resultado = numer1 - numer2;
        return resultado;
    }

    public static double multiplicaciones(double numer1, double numer2) {
        double resultado;
        resultado = numer1 * numer2;
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
        double num6;
        double num2;
        double num7;
        double num3;
        double num8;
        double num4;
        double num9;
        double num5;
        double num10;
        String operacion;
        System.out.println("Seleccione la operacion a Realizar(multiplicacion,division,suma,"
                + "resta,potencia,promedio,Promedioarreglo,numero maximo,lista invertida)");
        operacion = datos.next();
        switch (operacion) {
            case "multiplicacion": {
                System.out.println("Ingrese los numeros a utilizar(Presione enter para pasar de numero");
                num1 = datos.nextDouble();
                num2 = datos.nextDouble();
                double multiplicacion = multiplicaciones(num1, num2);
                System.out.println("El resultado es=" + multiplicacion);
                break;
            }
            case "dividision": {
                System.out.println("Ingrese los numeros a utilizar(Presione enter para pasar de numero");
                num1 = datos.nextDouble();
                num2 = datos.nextDouble();
                double division = divisiones(num1, num2);
                System.out.println("El resultado es=" + division);
                break;
            }
            case "suma": {
                System.out.println("Ingrese los numeros a utilizar(Presione enter para pasar de numero");
                num1 = datos.nextDouble();
                num2 = datos.nextDouble();
                double suma = sumas(num1, num2);
                System.out.println("El resultado es=" + suma);
                break;
            }
            case "resta": {
                System.out.println("Ingrese los numeros a utilizar(Presione enter para pasar de numero");
                num1 = datos.nextDouble();
                num2 = datos.nextDouble();
                double resta = restas(num1, num2);
                System.out.println("El resultado es=" + resta);
                break;

            }

            case "potencia": {

                int base;

                int exponente;

                int resultado = 0;

                System.out.println("Ingrese la base");
                base = datos.nextInt();
                System.out.println("Ingrese el exponente");
                exponente = datos.nextInt();
                int x = 1;
                while (x < exponente) {

                    if (resultado < base) {

                        resultado = base * base;

                    } else {

                        resultado = resultado * base;

                    }

                    x++;

                }

                System.out.println("Resultado=" + resultado);
                break;
            }
            case "promedio": {
                int suma = 0;
                double resultado1;
                System.out.println("Ingrese el número de datos a utilizar.");
                double data;
                data = datos.nextDouble();
                System.out.println("Ingrese los numeros a calcular, presione enter para pasar al siguiente número"
                        + "(Existen 5 espacios disponibles, en caso de no tener más datos coloque 0)");
                for (int i = 0; i < data; i++) {

                    num1 = datos.nextDouble();

                    suma += num1;
                }
                double resultado = divisiones(suma, data);
                System.out.println("El promedio es=" + resultado);
                break;
            }
            case "Promedioarreglo": {
                double sumar = 0;
                double datoso;

                System.out.println("Introduzca la cantidad de datos por analizar");
                datoso = datos.nextDouble();
                double[] arreglos = new double[(int) datoso];
                System.out.println("A continuación deberá introducir cada uno de los numeros ");
                for (int i = 0; i < datoso; i++) {

                    System.out.println("Ingresa el " + i + " numero:");
                    arreglos[i] = datos.nextInt();
                    sumar += arreglos[i];

                }

                for (int i = 0; i < datoso; i++) {

                    System.out.println("En la posicion " + (i + 1) + " se guardo: " + arreglos[i]);

                }

                System.out.println(" El promedio es : " + sumar / datoso);
                //Scanner ent = new Scanner(System.in);
                break;

            }
            case "lista": {
                double sumar = 0;
                double datoso;

                System.out.println("Introduzca la cnatidad de numeros que tiene su listado");
                datoso = datos.nextDouble();
                double[] arreglos = new double[(int) datoso];
                System.out.println("A continuación deberá introducir cada uno de los numeros ");
                for (int i = 0; i < datoso; i++) {

                    System.out.println("Numero " + i + " =");
                    arreglos[i] = datos.nextInt();
                }
                for (int i = 0; i < datoso; i++) {
                    System.out.println("En la posicion " + (i + 1) + " se guardo: " + arreglos[((int) datoso - 1) - i]);
                }
                break;
            }
            case "numero maximo": {
                int numi1;
                int numi2;
                int numi3;
                int numi4;
                int numi5;
                int numi6;
                int numi7;
                System.out.println("Ingrese los datos a evaluar");
                numi1 = datos.nextInt();
                numi2 = datos.nextInt();
                numi3 = datos.nextInt();
                numi4 = datos.nextInt();
                numi5 = datos.nextInt();
                numi6 = datos.nextInt();
                numi7 = datos.nextInt();
                int[] arreglo = {numi1, numi2, numi3, numi4, numi5, numi6, numi7};
                int max, min, g;

                min = max = arreglo[0];
                for (g = 0; g < arreglo.length; g++) {
                    if (min > arreglo[g]) {
                        min = arreglo[g];
                    }
                    if (max < arreglo[g]) {
                        max = arreglo[g];
                    }
                }
                System.out.println("Número máximo de la lista es= " + max);
                break;
            }

        }
    }
}
