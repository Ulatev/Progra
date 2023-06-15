/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Luis Ulate
 */
public class ejercicioB {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        double caracter;
        FileInputStream lectura;
        lectura = new FileInputStream("ejercicio/Binario1.txt");
        caracter=lectura.read();
        
        while (caracter!=-1){
                System.out.println((char)caracter);
                caracter=lectura.read();
        }
        lectura.close();
    }
}
   
