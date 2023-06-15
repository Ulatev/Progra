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

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de columnas");
        int x = sc.nextInt();
        int[][]numeros = new int [5][x];
        
        for(int i=0;i<5;i++){
            
        for(int j=0;j<numeros[0].length;j++){
        numeros[i][j]=(int)(Math.random()*10);
        
            }
            
        }

        for(int i=0;i<5;i++){ //Filas//
        System.out.println("    ");
        System.out.println("    ");
        for(int j=0;j<numeros[0].length;j++){ //Columnas//
            
        System.out.print(numeros[i][j] +"\t");    
           
        }     
        }
        
    }
    
}
