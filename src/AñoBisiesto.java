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

public class AñoBisiesto {

    public static void main(String[] args) {
        int año;
            Scanner datos=new Scanner(System.in);
            System.out.println("Ingrese el año a analizar");
        año=datos.nextInt();
        if(año%4==0 && (año%100!=0 || año%400==0)){             
        System.out.println(año+" Es un año bisiesto");
    }
        else{
            System.out.println(año+" No es un año bisiesto");
        }
       
        
       
       
    }}

