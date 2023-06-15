/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_For;

/**
 *
 * @author Luis Ulate 07-03-2023
 */

import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese un numero ");
        int limite = sc.nextInt();
        int i,suma=0,prome;    
   
        System.out.println("Ingrese un numero ");
        int num1 = sc.nextInt();
        suma += num1;
        
        for(i=2;i<=limite;i++){
    
        System.out.println("Ingrese un numero ");
        int num2 = sc.nextInt();
        suma += num2;

        if(num2 < num1){
    
            System.out.println("El segundo numero es menor al primer numero");
            
        }
        
        if(i>=limite){
       
        prome = suma / limite;
        System.out.println("El promedio es de: "+prome);
        
        }     
      
}
}
}
