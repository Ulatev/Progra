/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposflujo;

/**
 *
 * @author Luis Ulate 11/04/2023
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FlujoBits {
    
    public static void main (String[]args) throws FileNotFoundException, IOException {
        
        int caracter;//variable para recabar bit por bit de cada dato//
        FileInputStream lectura;//variable de tipo FileImputStream//
        FileOutputStream escritura;//variable de tipo FileOutputStream//
        
        //crear objetos de cada flujo//
        
        lectura = new FileInputStream("ejemplo.txt");
        escritura = new FileOutputStream("cop ejemplo.txt");
        
        caracter = lectura.read();//lee bit por bit
        
        while(caracter !=-1){
            
            escritura.write(caracter);//se escribe el valor en el archivo//
            System.out.print((char)caracter);//casteo para cambiar valor//Le quito el 'ln' para no hacer salto de linea y el mensaje lo mande completo en 1 linea//
            caracter = lectura.read();
            
        }
        
        System.out.println("\n Ya se realizo la copia del archivo");
        JOptionPane.showMessageDialog(null, "ya se realizo la copia del archivo");
        
        lectura.close();
        escritura.close();
        
    }
    
}
