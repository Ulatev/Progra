/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 08-03-2023
 */

//Ejercicio '2'

import java.util.Scanner;

public class Autobuses {
    
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);
        
        int distancia;
        double pasaje = 500;
        
        System.out.println("Ingrese la distancia que va a recorrer");
        distancia = sc.nextInt();
        
        if(distancia > 150){
            
        pasaje = pasaje +(5*(distancia-150));
            
        if(distancia > 250){
            
        pasaje = pasaje - (pasaje*0.15);    
        System.out.println("EL total a pagar es de: "+pasaje);
            
        }
        else{
            System.out.println("El total a pagar es de: "+pasaje);
        }
            }
        else{   
         System.out.println("El total a pagar es de: "+pasaje);        
         }     
       }    
    }
    