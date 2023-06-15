/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Switch;

/**
 *
 * @author Luis Ulate 08-03-2023
 */

import java.util.Scanner;

public class Operaciones {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
            int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
            int num2 = sc.nextInt();
        
        System.out.println("Ingrese un numero para las siguientes opciones:"
            + "\n1. Suma "
            + "\n2. Resta "
            + "\n3. Multiplicacion "
            + "\n4. Division "
            + "\n5. Promedio ");
        
        int ope = sc.nextInt();
        int suma, resta, multi, divi, prome;
        
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;
        divi = num1/num2;
        prome = num1+num2/2;
        
        switch(ope){
            
            case 1:
                System.out.println("El resultado de la suma es de: "+suma);
                break;
            
            case 2:
                System.out.println("El resultado de la resta es de: "+resta);
                break;
                
            case 3:
                System.out.println("El resultado de la multiplicacion es de: "+multi);
                break;
            
            case 4:
                System.out.println("El resultado de la division es de: "+divi);
                break;
                
            case 5:
                System.out.println("El resultado del promedio es de: "+prome);
                break;
                
            default:
                System.out.println("Su opcion es invalida");
                
        }
        
        
        
        
        
        
    }
    
}
