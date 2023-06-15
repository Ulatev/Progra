/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gabriel Rojas 
 */
public class ejercicioC {
    public static void main(String[] args) throws IOException{
        ejercicioC mFP=new ejercicioC();
        
        String ruta=mFP.ruta();
        String linea=mFP.contenido();
        mFP.escribir(linea,ruta);
    }
    String ruta() throws IOException{           
        String ruta=null;
        JFileChooser fileChooser=new JFileChooser(); 
        FileNameExtensionFilter FileNameExtensionFilter = new FileNameExtensionFilter("archivo de texto.txt");
        fileChooser.setFileFilter(filter);
        
        int seleccion=fileChooser.showOpenDialog(null);
        
        if (seleccion==JFileChooser.APPROVE_OPTION) {
            ruta=fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println("Ruta seleccionada"+ruta);
            
        }else{
            System.out.println("No se realizo la seleccion del archivo");
        }
        return ruta;
        
        
        int escribir(String linea, String ruta) throws IOException{
        ejercicioC mFP=new ejercicioC();
        PrintWriter escritura = new PrintWriter(new FileWriter(ruta));
        escritura.close();
        return linea;
    }
    }
}
