/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Gabriel Rojas
 */
public class ejercicioD {
    
     public static void main(String[] args) throws IOException {
         int caracter;
         FileInputStream lectura;
         BufferedOutputStream escritura=null;
         
         lectura =new FileInputStream("personal.txt");
         escritura = new BufferedOutputStream(new FileOutputStream("/coppersonal.txt"));
         
         caracter=lectura.read();
         while(caracter!=-1){
             escritura.write(caracter);
             System.out.println((char)caracter);
             caracter=lectura.read();
         }
         System.out.println("Realizado con exito");
         lectura.close();
         escritura.close();
     }
}
