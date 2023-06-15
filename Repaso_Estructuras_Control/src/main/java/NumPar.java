/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 08-03-2023
 */

//Ejercicio '6'

import java.util.Scanner;

public class NumPar {
    
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el primer numero"); 
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        
    for (int i = num1; i <= num2; i++){
       
        if(i % 2 == 0){
            
            System.out.println(""+i);
            
        }        
    }    
    
    }
}
