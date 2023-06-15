/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Seleccion;

/**
 *
 * @author Luis Ulate 02-03-2023
 */

import java.util.Scanner;

public class Dias {
    
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el dia de la semana");
        int dia = sc.nextInt();
        
        switch (dia){
            
            
            case 1:
                System.out.println("El dia " + "es lunes");
                break;
                
            case 2:
                System.out.println("El dia " + " es martes");
                break;
                
            case 3:
                System.out.println("El dia " + " es miercoles");
                break;
                
            case 4:
                System.out.println("El dia " + "es jueves");
                break;
                
            case 5:
                System.out.println("El dia " + "es viernes");
                break;
                
            case 6:
                System.out.println("El dia " + "es sabado");
                break;
                
            case 7:
                System.out.println("El dia " + "es domingo");
                break;
                
            default:
                System.out.println("Ingrese un dia valido");
                
        }
    }
    
    
}
