/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposflujo;

/**
 *
 * @author Luis Ulate 11/04/2023
 */


import java.io.*;


public class FlujoCaracteres {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
     //Inicio de flujos(declaracion e iniciacion)creacion de objetos
        
     BufferedReader lectura = new BufferedReader(new FileReader("ejemplo.txt"));   
     BufferedWriter escritura = new BufferedWriter(new FileWriter("copia_ej.txt"));
     
     PrintWriter escritura2 = new PrintWriter(new FileWriter("copiaEje2.txt"));
     
     String linea;
     
     while((linea = lectura.readLine())!=null){
         
         //usan BuferedReader escribir
         
         escritura.write(linea);
         
         //usando PrintWriter escribir
         
         escritura2.println(linea);
         
         //usando consola escribir
         
         System.out.println(linea.toUpperCase());
         
     }
     
     //Cierre de cada flujo, de deben cerrar todos y cada uno
     
     lectura.close();
     escritura.close();
     escritura2.close();
     
    }
}
