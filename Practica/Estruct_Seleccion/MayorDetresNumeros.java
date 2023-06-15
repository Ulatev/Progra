/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Seleccion;

/**
 *
 * @author Luis Ulate 03-03-2023
 */

import java.util.Scanner;

public class MayorDetresNumeros {
    
    public static void main (String[]args){
        
        Scanner sc = new Scanner (System.in);
        
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero ");
        num2 =  sc.nextInt();
        
        System.out.println("Ingrese el tercer numero ");
        num3 = sc.nextInt();
        
        if (num3 > num1 && num2 < num3){
            
            System.out.println("El tercer numero es el mayor"+num3);
    
        }
    
        else if (num3 > num1 && num3 < num2 ){
            
            System.out.println("El segundo numero es el mayor"+num2);
           
        }
        
        else {
            
            System.out.println("El primer numero es el mayor"+num1);
          
        }
        
        
    }
}
