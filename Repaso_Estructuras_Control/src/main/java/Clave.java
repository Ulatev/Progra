/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 14-03-2023
 */

//Ejercicio '5'

import java.util.Scanner;

public class Clave {
    
public static void main (String[]args){
        
Scanner sc = new Scanner(System.in);

int clave = 0;
int intentos = 3;
int ClaveUsuario = 0;

    System.out.println("Ingrese una contraseña 'Maximo 3 caracteres'");
    clave = sc.nextInt();    
    
    if(clave <= 0 || clave >= 999){
        
        System.out.println("Lea nuevamente las instrucciones");
        
    }
        
    while(intentos > 0 & clave != ClaveUsuario){
        
          System.out.println("Ingrese la contraseña " + " 'Intentos restantes:' " + "'" + intentos +"'");
          ClaveUsuario = sc.nextInt();
           
         intentos -- ;
            
        if(clave == ClaveUsuario){
        System.out.println("Acceso Autorizado");
            
        }
        if(intentos<1){
   
        System.out.println("Recibira un correo de recuperacion en los proximos 3 dias");
       
            
        }
        
    }
    

    }
        
          
}
