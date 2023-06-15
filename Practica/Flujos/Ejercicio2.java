/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Ulate 12/04/2023
 */



public class Ejercicio2 {

public static void main(String[] args) throws FileNotFoundException, IOException {

    
    int caracter;
    FileInputStream lectura;
    
    lectura = new FileInputStream ("C:\\Users\\CTPG\\Documents\\Ejercicios\\Binario1.txt");
    
    caracter = lectura.read();
    
    while (caracter != -1){
        
        System.out.println((char)caracter);
        caracter = lectura.read();
       
        
    }
    
    System.out.println((char)caracter);
    
    lectura.close();
    
    }    
    
    }
     
          
    

    

