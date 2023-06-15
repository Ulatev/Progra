/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author 03-03-2023
 */

import java.util.Scanner;

public class SumaImpares {

public static void main (String[]args){
    
    int suma = 0;
    int i=1;
    
    do{
        
     if(i % 2==0){
        
         
     
     }else{
         
     suma += i;
     
     }
     
     i++;
     
    }while(i<12);
    
    System.out.println("El numero impar es: "+suma);
    
    }
}
    

