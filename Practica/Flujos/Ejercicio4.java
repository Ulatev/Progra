/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Luis Ulate 13/04/2023
 */

import java.io.*;
public class Ejercicio4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int caracter;
        
        BufferedInputStream lectura = null;
        BufferedOutputStream escritura = null;
        
        lectura = new BufferedInputStream (new FileInputStream ("C:\\Users\\CTPG\\Documents\\Ejercicios\\Personal.txt"));
        escritura = new BufferedOutputStream (new FileOutputStream("C:\\Users\\CTPG\\Documents\\Ejercicios\\Personal-Copia.txt"));
        caracter = lectura.read();
        
        while(caracter !=-1){
            
            System.out.print((char)caracter);
            caracter = lectura.read();
            
        }
        
        System.out.println((char)caracter);
        System.out.println("");
        System.out.println("El archivo fue copia con exito");
        
        lectura.close();
        escritura.close();
    }
    
}
