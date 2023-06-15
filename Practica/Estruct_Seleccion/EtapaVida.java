/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Seleccion;

/**
 *
 * @author Luis Ulate 03-03-2023
 */

import java.util.Scanner;

   public class EtapaVida {
    
     public static void main (String[]args){
        
     Scanner sc = new Scanner (System.in);
        
        int edad;
    
        System.out.println("Ingrese la edad de la persona");
        edad = sc.nextInt();
        
        if ( edad > 0 && edad < 3 ){
            
            System.out.println("Es un bebe");   
        }
        else if (edad >= 11 & edad <= 4){
            
            System.out.println("Es un nino");
            
        }
        else if(edad >=12 & edad <= 29){
           
            System.out.println("Es un adulto joven");
            
        }
        
        else if(edad >= 30 & edad <=64){
            
            System.out.println("Es un adulto");
            
        }
        
        else if(edad>=64 & edad <= 150){
            
            System.out.println("Es un adulto mayor");
            
        }
        
        else {
            
            System.out.println("Ingrese una edad valida");
            
        }
        
    }
    
}
