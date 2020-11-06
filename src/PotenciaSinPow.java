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
public class PotenciaSinPow {
    public static void main(String[]args){
        Scanner datos= new Scanner(System.in);
        

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
             
                
            }
    }
    

