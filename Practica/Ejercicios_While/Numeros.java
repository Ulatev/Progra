/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_While;

/**
 *
 * @author 03-03-2023
 */

import java.util.Scanner;

public class Numeros {
    
public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    
    int num = 1, suma = 0, i = 0, prome;
    
    while(num != 0 ){
        
        System.out.println("Ingrese un numero('0' Para finalizar el programa)");
        num = sc.nextInt();
        
        
        if (num !=0 ){
        
        i ++;
        
        suma += num;
           
        }
        
        else{
            
        prome = suma/i;
        System.out.println("Suma: "+suma+"\nCantidad: "+i+"\nPromedio: "+prome);
            
        }
        
    }
}       
}
