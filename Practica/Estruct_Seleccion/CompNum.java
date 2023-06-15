package Estruct_Seleccion;

/**
 *@author Luis Ulate 01-03-2023
 * 
 */

import java.util.Scanner;

public class CompNum {

public static void main(String[] args){
    
    int num1;
    int num2;
    int resultado = 0;
    
    Scanner sc = new Scanner (System.in);
    
    //Ejercicio (2 - a)
    
    System.out.println("Digite el primer numero");//Peticion de datos
    num1 = sc.nextInt();
    
    System.out.println("Digite el segundo numero");//Peticion de datos
    num2 = sc.nextInt();
    
    if (num1 <= num2){
             
    System.out.println("El primer numero es menor ");//Comparacion de los numeros  
        
    }
    
    else if (num1 >= num2){
        
        System.out.println("El primer numero es mayor");//Comparacion de los numeros
        
    }
    
    else
    
    resultado = num1 + num2;
    System.out.println("El resultado de la suma de: "+num1+" y "+ num2+" es de: "+resultado);//Resultado de la suma de los numeros                        
}  
}   
