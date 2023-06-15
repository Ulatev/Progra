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

public class CreandoPDF1 {

Document doc = new Document();


Font t1 = new Font(Font.FontFamily.HELVETICA,24,Font.BOLD,BaseColor.GREEN);

Font t2 = new Font (Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD,BaseColor.BLUE);

Font enca1 = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD,BaseColor.RED);

Font enca2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD,BaseColor.BLACK);

Font enca3 = new Font(Font.FontFamily.TIMES_ROMAN, 14,Font.BOLD,BaseColor.CYAN);

Font text = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD,BaseColor.DARK_GRAY);

Font t3 = new Font (Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD,BaseColor.GRAY);

Font f1 = new Font (Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.PINK);

Font f2 = new Font (Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.ORANGE);


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
private void eBlancas(Paragraph parrafo, int cantLineas){
    
    for(int i=0; i<cantLineas; i++){
        
        parrafo.add(new Paragraph(" "));
        
    }
    
}

//Procedimiento para agregar la portada del archivo//

private void agregarPortada(){
    
    doc.open();
    Paragraph titulo = new Paragraph("Investigando un nuevo concepto", t1);
    eBlancas(titulo,8);
    
    Paragraph subtitulo = new Paragraph("Conecepto A",t2);
    Paragraph subtitulo1 = new Paragraph("Cibernetica",t3);
    
    try{
        
        doc.add(titulo);
        doc.add(subtitulo);
        doc.add(subtitulo1);
        
    }catch(Exception e){
        
       
    }
    
}

private void agregarContenido (){
    
    try{
        
        doc.newPage();
        
        Paragraph p =new Paragraph("Aprendo un nuevo concepto", enca1);
        doc.add(p);
        
        
        p = new Paragraph("Sobre los gatos y su accionar",text);
        eBlancas(p,3);
        doc.add(p);
        
        p = new Paragraph ("Evolucion",enca2);
        eBlancas(p,3);
        doc.add(p);
        
        
        p = new Paragraph("La evolucion de los seres humanos"
                + "es algo maravilloso y trascendental "
                + "de manera que es importante para todos "
                + "conocer este tipo de informacion",text);
        p.setAlignment(Paragraph.ALIGN_RIGHT);
        eBlancas(p,3);
        doc.add(p);
        
        p = new Paragraph("Los ejercicios en el gimnasio son buenos siempre"
                + " y cuando se realicen de una buena manera"
                + " y con un calentamiento previo ",text);
        p.setAlignment(Paragraph.ALIGN_LEFT);
        eBlancas(p,3);
        doc.add(p);
        
        
           p = new Paragraph("La cibernética es una rama interdisciplinaria de la ingeniería y las ciencias"
                   + " de la computación que se enfoca en el estudio de sistemas, procesos y estructuras "
                   + "en términos de la comunicación y el control. Su objetivo es comprender cómo funcionan"
                   + " los sistemas y cómo se pueden diseñar y controlar para lograr un rendimiento óptimo."
                   + " La cibernética se basa en la idea de que los sistemas pueden describirse y analizarse "
                   + "mediante modelos matemáticos y que la información es fundamental para su control y gestión.​",text);
        p.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        eBlancas(p,3);
        doc.add(p);
        
        
           p = new Paragraph("La cibernética se aplica en una amplia variedad de campos, desde la robótica"
                   + " y la inteligencia artificial hasta la biología y la psicología. Sus aplicaciones incluyen"
                   + " el control de procesos industriales, la automatización de sistemas, la toma de decisiones y "
                   + "el análisis de datos. La cibernética también se utiliza en el diseño de sistemas de comunicaciones y"
                   + " redes informáticas, así como en la seguridad informática y la protección contra ataques cibernéticos. "
                   + "En resumen, la cibernética es una disciplina esencial en la era de la tecnología de la información y "
                   + "desempeña un papel importante en la creación y gestión de sistemas inteligentes y automatizados.",text);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        eBlancas(p,3);
        doc.add(p);
        
        
    }catch(Exception e){
        
        
    }
    
}

}