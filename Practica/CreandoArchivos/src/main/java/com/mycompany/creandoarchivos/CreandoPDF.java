/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creandoarchivos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;


/**
 *
 * @author Luis Ulate 
 */

public class CreandoPDF {

Document doc = new Document();


Font t1 = new Font(Font.FontFamily.TIMES_ROMAN,22,Font.BOLD,BaseColor.BLUE);

Font t2 = new Font (Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD,BaseColor.BLUE);

Font enca1 = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD,BaseColor.RED);

Font enca2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD,BaseColor.RED);

Font enca3 = new Font(Font.FontFamily.TIMES_ROMAN, 14,Font.BOLD,BaseColor.RED);

Font text = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD,BaseColor.RED);



//Procedimiento para creacion de PDF//


public void creandoArchivoPDF(){
    
    abrirPDF();
    agregarPortada();
    agregarContenido();
    
    doc.close();
}

//Procedimiento para abrir un PDF//

private void abrirPDF (){
    
    /*Se llena a JFileChooser para mostrar caja de navegacion de archivos*/
    
    JFileChooser jf = new JFileChooser();
    jf.showSaveDialog(null);   
    
    File file=jf.getSelectedFile();
    
    try{
        //Se toma la ruta y la extension del archivo
        PdfWriter.getInstance(doc, new FileOutputStream(file.getAbsolutePath()+".pdf"));
        
    }catch(Exception e){
        
    }
}
//Procedimiento para agregar espacios o lineas vacias//
private void lineasBlancas(Paragraph parrafo, int cantLineas){
    
    for(int i=0; i<cantLineas; i++){
        
        parrafo.add(new Paragraph(" "));
        
    }
    
}

//Procedimiento para agregar la portada del archivo//

private void agregarPortada(){
    
    doc.open();
    Paragraph titulo = new Paragraph("Investigando un nuevo concepto", t1);
    lineasBlancas(titulo,8);
    
    Paragraph subtitulo = new Paragraph("Conecepto A",t2);
    
    try{
        
        doc.add(titulo);
        doc.add(subtitulo);
        
    }catch(Exception e){
        
       
    }
    
}

private void agregarContenido (){
    
    try{
        
        doc.newPage();
        
        Paragraph p =new Paragraph("Aprendo un nuevo concepto", enca1);
        doc.add(p);
        
        
        p = new Paragraph("Sobre los gatos y su accionar",text);
        lineasBlancas(p,1);
        doc.add(p);
        
        p = new Paragraph ("Evolucion",enca2);
        lineasBlancas(p,1);
        doc.add(p);
        
        
        p = new Paragraph("La evolucion de los seres humanos"
                + "es algo maravilloso y trascendental "
                + "de manera que es importante para todos "
                + "conocer este tipo de informacion",text);
        p.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        lineasBlancas(p,3);
        doc.add(p);
        
        p = new Paragraph("Los ejercicios en el gimnasio son buenos siempre"
                + " y cuando se realicen de una buena manera"
                + " y con un calentamiento previo ",text);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        lineasBlancas(p,4);
        doc.add(p);
        
    }catch(Exception e){
        
        
    }
    
}

}