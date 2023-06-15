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

public class FlujoByteBuffer {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int caracter;
        
        BufferedInputStream lectura = null;
        BufferedOutputStream escritura = null;
        
        //creando objetos de cada flujo de E/S
        
        lectura = new BufferedInputStream (new FileInputStream("ejemplo.txt"));
        escritura = new BufferedOutputStream (new FileOutputStream("ejemplo2.txt"));
        
        caracter = lectura.read();
        
        //Hacer el recorrido de ficheros byte por byte hasta llegar al final
        
        while (caracter!=-1){
            
            escritura.write(caracter);
            caracter=lectura.read();
            
        }
        
        System.out.println("El archivo fue copiado exitosamente");
        
        lectura.close();
        escritura.close();
        
    }
    
}
