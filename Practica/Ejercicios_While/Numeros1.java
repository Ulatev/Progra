/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_While;

/**
 *
 * @author Luis Ulate 15-03-2023
 */

import java.util.Scanner;

public class Numeros1 {
 
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    
    int num=1,suma=0,i=0,prom,total=0;
    
    while (num!=0){
        
        System.out.println("Ingrese un numero (0) para finalizar el programa ");
        num = sc.nextInt();
        
        suma += num;
        total++;
        
    }
        prom = suma/total;
        System.out.println("La suma de los numero es: "+suma
        +"\n El total es: "+total
        +"\n El promedio de los numeros es: "+prom);
    
    }
    
}
