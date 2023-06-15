/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Luis Ulate 12/04/2023
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        String linea, ruta, texto;
        
        System.out.println("Ingrese la ruta del fichero y luego el nombre del archivo");
        ruta = sc.nextLine();
        
        System.out.println("Ingrese el contenido del fichero");
        texto = sc.nextLine();
        
        BufferedReader lectura = new BufferedReader (new StringReader(texto));
        BufferedWriter escritura = new BufferedWriter (new FileWriter(ruta));
        
        while((linea=lectura.readLine())!=null){
            
            escritura.write(linea.toUpperCase());
            
            System.out.println(linea.toUpperCase());
            
        }
    
        lectura.close();
        escritura.close();
        
    }
 
    
    //Cambiar el codigo y ponerlo en metodo
    
    
}
