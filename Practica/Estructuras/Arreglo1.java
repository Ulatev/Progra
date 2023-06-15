/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.Scanner;

/**
 *
 * @author Gabriel Rojas
 */
public class Arreglo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
    //crear arreglo
     String arrayFrutas[];
     //inicializar arreglo
     //asignar tamano
    arrayFrutas =new String[6];
    
    //llenar arreglo
    arrayFrutas[0]="Fresa";
    arrayFrutas[1]="Mango";
    arrayFrutas[2]="Sandia";
    arrayFrutas[3]="Limon";
    arrayFrutas[4]="Naranja";
    arrayFrutas[5]="Melon";
    
        System.out.println("El arreglo de la posicion 0 es"+arrayFrutas[0]);
        System.out.println("El arreglo de la posicion 1 es"+arrayFrutas[1]);
        System.out.println("El arreglo de la posicion 2 es"+arrayFrutas[2]);
        System.out.println("El arreglo de la posicion 3 es"+arrayFrutas[3]);
        System.out.println("El arreglo de la posicion 4 es"+arrayFrutas[4]);
        System.out.println("El arreglo de la posicion 5 es"+arrayFrutas[5]);
        
        //lenado con for
        for (int i=0;i<arrayFrutas.length;i++){
            System.out.println("Digite un nombre de una fruta");
            arrayFrutas[i]=sc.nextLine();
        }
        for (int i=0;i<arrayFrutas.length;i++){
            System.out.println(arrayFrutas[i]);
        
    }
}
}

   
    
