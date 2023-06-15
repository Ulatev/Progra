/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Luis Ulate 03/05/2023
 */


public class EnterosC {
    
    public static void main(String[] args) {
        
        int numeros[] = new int[20];
        int suma =0;
        double promedio;
        
        for(int i=0;i<numeros.length;i++){
        numeros[i]=i++;
        
        }
        
        for(int i=0;i<numeros.length;i++){
            
            suma =+ numeros[i];
            
        }
        
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
            
        }
        
            System.out.println("La suma de los numeros es: "+suma);
            System.out.println("El promedio de los numeros es: "+promedio);
        
    }
        
    }
    

