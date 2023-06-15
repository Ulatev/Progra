/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos2;

/**
 *
 * @author Luis Ulate 04/05/2023
 */

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int [][]numeros = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
        
        for(int j=0;j<3;j++){
            
        System.out.println("Ingrese los numeros que desea en las filas " +i+ " "+j);
        int nume = sc.nextInt();
        numeros [i][j] = nume;
        
        } 
        }
       
        for(int i=0;i<3;i++){           //Filas
        System.out.println("");
        System.out.println(""); 
        for(int j=0;j<3;j++){         //Columnas
            
        System.out.print(numeros[i][j]+"\t");
        
        }     
        }
        
    }
    
}
