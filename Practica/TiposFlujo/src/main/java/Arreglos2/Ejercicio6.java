/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos2;

import java.util.Scanner;

/**
 *
 * @author Luis Ulate 10/05/2023
 */

public class Ejercicio6 {
   
    public static void main(String[] args) {
        
        String [][] produ = new String[7][2];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<7;i++){
        
        for(int j=0;j<2;j++){
            
        System.out.println("Ingrese el nombre de la golosina " +i+ " y luego ingrese el precio " +j);
        String nume = sc.nextLine();
        produ[i][j] = nume;
        
        }
            
        }
        
        for(int i=0;i<7;i++){           //Filas
        System.out.println(" ");
        System.out.println(" "); 
        for(int j=0;j<2;j++){         //Columnas
            
        System.out.print(produ[i][j]+"\t");
        
        }     
        }
         
        
    }
    
}
