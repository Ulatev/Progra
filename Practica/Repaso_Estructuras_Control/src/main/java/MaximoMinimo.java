/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 14-03-2023
 */

//Ejercicio '7'

import java.util.Scanner;

public class MaximoMinimo {
    
public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    int num1, num2, total=0;
    
    System.out.println("Ingrese el numero maximo");
    num1 = sc.nextInt();
    
    System.out.println("Ingrese el numero minimo");
    num2 = sc.nextInt();
    
    while(num1==2&&num2==0){
        
    for (num1=1;num1==num2;num1++){
            
    total=total+num1;
    }
    System.out.println("El total es: "+total);
    }
}   
}
