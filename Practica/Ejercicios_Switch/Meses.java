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

public class Meses {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int op;
        
        System.out.println("Ingrese un numero para el mes del año");
        op = sc.nextInt();
        
        switch (op){
            
            
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
            default:
                System.out.println("La opcion es invalida");
                
        }
        
    }
    
}
