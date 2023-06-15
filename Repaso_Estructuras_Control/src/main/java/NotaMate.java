/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 08-03-2023
 */

//Ejercicio '1'

import java.util.Scanner;

public class NotaMate {
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        double NotaExamen, NotaProyecto, NotaTareas;
        boolean RadioAsistencia;
        
        
        System.out.println("Ingrese la nota obtenida en el examen");
        NotaExamen = sc.nextDouble();
        
        System.out.println("Ingrese la nota obtenida en el proyecto");
        NotaProyecto = sc.nextDouble();
        
        System.out.println("Ingrese la nota de las tareas");
        NotaTareas = sc.nextInt();
        
        System.out.println("¿El estudiante cumple con el minimo de asistencia requerido? 'True o False'");
        RadioAsistencia = sc.nextBoolean();
        
        
        NotaProyecto = (NotaProyecto*3)/10;
        NotaExamen = (NotaExamen*6)/10;
        NotaTareas = (NotaTareas*1)/10;
        
        double nota = NotaProyecto + NotaExamen + NotaTareas;
        
        if(nota>=5 && RadioAsistencia == true){
            
            System.out.println("Su nota es: "
                    + "\n"+nota
                    +"\n Y su condicion es Aprobado");
            
        }else{
            
                System.out.println("Su nota es: "
                        + "\n"+nota
                        + "\n Y su condicion es Reprobado");
            
            
        }
        
    }
    
    
}
