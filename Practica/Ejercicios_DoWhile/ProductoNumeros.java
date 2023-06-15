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

public class ProductoNumeros {
    
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int num ,ope = 1 ,i = 1;
        
        do{
        
        System.out.println("Ingrese un numero");//Ingreso de datos por el usuario
        num = sc.nextInt();
        
        i++;
       
        ope *= num;//Operacion
              
        }while(i<=5);
        
        System.out.println("El producto de los numero es: "+ope);//Salida de datos luego de la operacion
        
        
      
    }
}