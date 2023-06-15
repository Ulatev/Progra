package Estruct_Seleccion;

/**
 *
 * @author Luis Ulate 02-03-2023
 */

import java.util.Scanner;

public class Calificaciones {
        
public static void main (String []args){
    
    int nota;
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la nota del estudiante");
    nota = sc.nextInt();
    
    if (nota >= 85 && nota <= 100){
        
        System.out.println("La nota es una 'A'");
        
                }
    
    else if (nota <= 69 && nota < 85){
        
        System.out.println("La nota es una 'B' ");
        
    }
    
    else if (69 > nota && nota >= 0) {
        
    System.out.println("La nota es una 'C' ");    
        
    }
}     
}
