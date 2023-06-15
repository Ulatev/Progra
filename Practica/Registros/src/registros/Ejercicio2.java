/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

import java.util.Scanner;

/**
 *
 * @author Luis Ulate 18/05/2023
 */



    public class Ejercicio2 {

    String artista, titulo;
    int duracion;
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);    
    Ejercicio2 cancion[] = new Ejercicio2[15];
    
    for(int i=0;i<cancion.length;i++){
       
    cancion[i]=new Ejercicio2();    
        
    System.out.println("Ingrese el nombre del artista de la cancion");
    cancion[i].artista = sc.nextLine();
    cancion[i].artista = sc.nextLine();
    
    System.out.println("Ingrese el titulo de la cancion");
    cancion[i].titulo = sc.nextLine();
   
    System.out.println("Ingrese la duracion de la cancion en segundos");
    cancion[i].duracion = sc.nextInt();
   
    System.out.println("");
    System.out.println("");
        
        
    System.out.println("Artista");
    System.out.println("|"+cancion[i].artista+"|");
    
    System.out.println("Titulo");
    System.out.println("|"+cancion[i].titulo+".MP3|");
    
    System.out.println("Duracion");
    System.out.println("|"+cancion[i].duracion+"|");
        
    }
   

   
    
    
    }

    
}
