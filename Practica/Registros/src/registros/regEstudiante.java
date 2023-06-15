/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

/**
 *
 * @author CTPG
 */


public class regEstudiante {
   
    
String cedula, nombre;
int edad; 
boolean beca;
double promedio;
char estado; 

    public static void main(String[] args) {
        
        //Instancia//
        
        regEstudiante estudiante = new regEstudiante();
        regEstudiante estudiante1 = new regEstudiante();
        
        
        
        estudiante.cedula="119580023";
        estudiante.nombre="Luis Ulate";
        estudiante.beca=true;
        estudiante.promedio=70;
        
        //A= Aprobado R=Reprobado S=Aplazado//
        
        estudiante.estado='A';
        
        //Imprimir objetos de registro//
        
        System.out.println("Cedula: "+estudiante.cedula);
        System.out.println("Nombre: "+estudiante.nombre);
        System.out.println("Beca: "+estudiante.beca);
        System.out.println("Promedio: "+estudiante.promedio);
        System.out.println("Estado: "+estudiante.estado);

        //Segunda instancia//
        
        estudiante.cedula="8921325132";
        estudiante.nombre="Maria Arias";
        estudiante.beca=false;
        estudiante.promedio=70;
        
        //A= Aprobado R=Reprobado S=Aplazado//
        
        estudiante.estado='R';
        
        //Imprimir objetos de registro//
        
        System.out.println("Cedula: "+estudiante.cedula);
        System.out.println("Nombre: "+estudiante.nombre);
        System.out.println("Beca: "+estudiante.beca);
        System.out.println("Promedio: "+estudiante.promedio);
        System.out.println("Estado: "+estudiante.estado);
        
    }

        }
