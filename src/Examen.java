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

public class Examen {

    public static double riesgos(double edad) {
        double dato = 0.9;
        double resultado = dato * edad;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre;
        String apellido;
        String sexo;
        String enfermedad;
        String sangre;
        String covid;
        String no = "no";
        double edad, riesgo;
        int repeticion;
        for (int i = 1; i > 0; i++) {
            System.out.println("Ingrese los datos básicos del paciente");
            System.out.println("Nombre");
            nombre = datos.next();
            System.out.println("Apellido");
            apellido = datos.next();
            System.out.println("Sexo(Hombre o Mujer");
            sexo = datos.next();
            System.out.println("Edad");
            edad = datos.nextInt();
            System.out.println("Ingrese los datos médicos del paciente");
            System.out.println("Antecedentes de enfermedades en el paciente(digite las "
                    + "enfermedades seguidas y separadas por comas), de lo contrario digite no");
            enfermedad = datos.next();
            System.out.println("Ingrese el tipo de sangre del paciente");
            sangre = datos.next();
            System.out.println("Resultado de prueba para COVID-19");
            covid = datos.next();
            System.out.println("Nombre del paciente: " + nombre + ",  Apellido: " + apellido + ", Edad: "
                    + edad + ", Sexo: " + sexo);
            System.out.println("Historial médico: ");
            System.out.println("Antecedente de enfermedades: " + enfermedad + ", "
                    + "tipo de sangre: " + sangre);

            System.out.println("Resultado de prueba Covid-19: " + covid);
            if (edad >= 60) {
                System.out.println("Debido a factores como su edad su salud corre un riesgo "
                        + "aún mayor con relación a la exposición del virus. Recomendamos encarecidamente tomar "
                        + "medidas de previsión por encima de las recomendadas");
                if (!enfermedad.equals(no)) {
                    System.out.println("Debido a su historial médico recomendamos que np se exponga de manera "
                            + "innecesaria, tome las medidas pertinentes");
                }

            }

            switch (sangre) {
                case "o+": {
                    System.out.println("Por motivo de su tipo de sangre su salud es potencialmente más "
                            + "factible a ser encubadora del virus y tener mayores repercuciones, con esto sabido tome las medidas preventivas y "
                            + "evite al máximo el contagio");
                    break;
                }
            }

            riesgo = riesgos(edad);
            System.out.println("Según nuestras estimaciones su riesgo de contagio es del: " + riesgo + "%");
            System.out.println("Si necesita ingresar otro paciente digite 1, "
                    + "en caso de haber terminado digite 2");
            repeticion = datos.nextInt();
            if (repeticion == 1) {
            } else {
                System.exit(0);
            }

        }
    }

}
