/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */import java.util.Scanner;
public class NumeroPi {
    public static void main(String[] args) {
        double pi;
        Scanner datos=new Scanner(System.in);
        int[] max={12};
        pi=4- 4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17-4/19+4/21-
        4/23+4/25-4/27+4/29-4/31+4/33-4/35+4/37-4/39+4/41-4/43+4/45-4/47+
        4/49-4/51+4/53-4/55+4/57-4/59+4/61-4/63+4/65-4/67+4/69-4/71+4/73-4/75+
        4/77-4/79+4/81-4/83+4/85-4/87+4/89-4/91+4/93-4/95+4/97-4/99+4/101-4/103+4/105;
    System.out.println(pi);
    
    for(int i=0;i<max.length;i++){
        double num;
        num=datos.nextInt();
        max[i]=(int)num;
    System.out.print(max[i]);
    }
}}
