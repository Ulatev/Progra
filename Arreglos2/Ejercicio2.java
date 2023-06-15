/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos2;

/**
 *
 * @author Luis Ulate 03/05/2023
 */



public class Ejercicio2 {

    public static void main(String[] args) {
        
        int [][] numeros = new int[4][4];
        int num=1;
        
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
               
                numeros[i][j]=num;
                num++;
                
            }    
        }
        
        for(int i=0;i<4;i++){
        System.out.println("");
        System.out.println("");
        for(int j=0;j<4;j++){
            
        System.out.print(numeros[i][j]+"\t");    
           
        
        }     
        }
       
    }
    
}
