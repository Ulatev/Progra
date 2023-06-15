/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposflujo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 *
 * @author Luis Ulate 3/04/2023
 */


    public class Ejemplo1 {

    public static void main(String[] args) throws FileNotFoundException {
        
        String linea;
        
        //creamos un archivo como flujo
        
        System.setOut(new PrintStream(new FileOutputStream("Prueba")));
        System.out.println("Archivo de prueba");
        
        for (int i=0;i<=15;i+=2){
        
        System.out.println(i);
        
        
} 

}
}
