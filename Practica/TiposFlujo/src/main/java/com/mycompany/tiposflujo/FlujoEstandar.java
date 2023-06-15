/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposflujo;

/**
 *
 * @author Luis Ulate 11/04/2023
 */

import java.util.Scanner;

public class FlujoEstandar {
    
    public static void main(String[] args) {
        
        //instancia de la clase escaner con nombre sc//
        
        Scanner sc = new Scanner (System.in);
        
        //Declarar dos variables de tipo cadena//
        
        String num1,num2;
        
        System.out.println("Digite dos numeros que esten entre '0' y '10'");
        num1 = sc.nextLine();
        num2 = sc.nextLine();
        
        if(!num1.isEmpty()&&!num2.isEmpty()){
            
            System.out.println("");
            
        }
        //Realizar sumatoria de los numeros solo si estan dentro del rango//
        
        int aux1, aux2;
        int sumatoria;
        
        if(isNumerico(num1)){
            
            aux1 = Integer.parseInt(num1);
            aux2 = Integer.parseInt(num2);
            
            if(aux1!=0&&aux2!=0){
                
                if(aux1>=0&&aux1<=10){
                    
                    if(aux2>=0&&aux2<=10){
                        
                        sumatoria = aux1+aux2;
                        System.out.println("El resultado de la sumatoria es: "+sumatoria);
                        
                    }
                    
                    else{
                        
                        System.out.println("El segundo valor esta fuera del rango");
                        
                    }
                }
                
                else{
                    
                    System.out.println("El primer valor esta fuera del rango");
                    
                }
                
            }   
        }
        
        else{
                
                System.out.println("Los datos no son numericos, no se puede continuar");
                
            }
        
    }
    
    public static boolean isNumerico (String cadena){
        
        try{
            
        Integer.parseInt(cadena); //convertir de string a int//
        return true;
        }
    
        catch (NumberFormatException nfe){
                
                return false;
                }
        
    }
    
}
