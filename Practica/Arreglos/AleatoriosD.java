/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CTPG
 */
public class AleatoriosD {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int suma =0, promedio=0;
        
        int[] numeros=new int [40];
        
        for(int i=0;1<numeros.length;i++){
            
        numeros[i]=(int)(Math.random()*40);
            
        }
        
        System.out.println("Los numeros aleatorios del arreglo son: ");
        
        for(int numero:numeros){
            
            System.out.println(numero);
            suma+=numero;
                 
        }
        
        Arrays.sort(numeros);
        System.out.println("Arreglo en orden ascendente");
        for(int i=0;i<numeros.length;i++);{
        System.out.println(numeros[i]+" ");
      
    }
      
        System.out.println();
        Arrays.sort(numeros);
        System.out.println("Arreglo en orden descendente");
        
        for(int i=numeros.length-1;i>=0;i--){
            
            System.out.println(numeros[i]+" ");
            
        }
        
    }
    
}
