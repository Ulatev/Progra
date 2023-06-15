/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Ulate
 */



public class Ejercicio1 {
    
    public static void main(String[] args) throws IOException {
        
        final String ruta = "C:\\Users\\CTPG\\Documents\\Ejercicios\\ABC.txt";
        String linea = "";
        
        try(FileReader fr = new FileReader(ruta)){
            
            int dato = fr.read();
            while (dato !=-1){
                
                //Si el caracter es un espacio no se incluye//
                
                if(dato !=32){
                    
                    linea = linea + (char)dato;
                    
                }
                
                dato = fr.read();
                
            }
            
            JOptionPane.showMessageDialog(null, linea);
            
        }catch(IOException e){
            
            System.out.println("Error"+e);
            
        }
        
        
    }
    
    
}
