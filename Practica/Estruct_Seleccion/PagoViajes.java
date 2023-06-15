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

public class PagoViajes {
    
    public static void main (String[]args){
        
    Scanner sc = new Scanner(System.in);
       
    double monto;
            
    System.out.println("Ingrese la cantidad de alumnos que viajan");
        
    int num = sc.nextInt();
        
    if(num > 120){
        
        monto = num * 2500;
         
    }
       
    else if (num >= 60 && num <= 120) {
        
        monto = num * 2800;
        
    }
    
    else {monto = 550000 ;}
        
        System.out.println("El total a pagar por los estudiantes es de: " + monto);
        
    }
    
    
    }
    
    

