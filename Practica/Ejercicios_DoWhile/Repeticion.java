/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author Luis Ulate 07-03-2023
 */

import java.util.Scanner;

public class Repeticion {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        do{
        
        System.out.println("Ingrese un numero ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        num2 =  sc.nextInt();
     
        
    }while(num1 != num2);
    
        System.out.println("Los numeros son iguales");
        
}
}