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
public class ArregloA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String [][] productos=new String[3][3];
        
        
        //llenar manualmente
        productos [0][0]="Manzana";
        productos [0][1]="Mango";
        productos [0][2]="Pera";
        productos [1][0]="Durazno";
        productos [1][1]="Fresa";
        productos [1][2]="Sandia";
        productos [2][0]="Papaya";
        productos [2][1]="Yuplon";
        productos [2][2]="Naranja";
        
        //imprimir arreglo manualmente
        System.out.println("el arreglo de la posicion 0,0"+productos [0][0]);
        System.out.println("el arreglo de la posicion 0,1"+productos [0][1]);
        System.out.println("el arreglo de la posicion 0,2"+productos [0][2]);
        System.out.println("el arreglo de la posicion 1,0"+productos [1][0]);
        System.out.println("el arreglo de la posicion 1,1"+productos [1][1]);
        System.out.println("el arreglo de la posicion 1,2"+productos [1][2]);
        System.out.println("el arreglo de la posicion 2,0"+productos [2][0]);
        System.out.println("el arreglo de la posicion 2,1"+productos [2][1]);
        System.out.println("el arreglo de la posicion 2,2"+productos [2][2]);
        System.out.println("El arreglo tiene dos dimensiones");
        System.out.println("El indice maximo es de 2");
        System.out.println("El tipo de dato que al macena es tipo entero");
        System.out.println("Se uso un arreglo Bidimensional10");
        
        //llenado con for
         for (int i=0;i<productos.length;i++){
              for (int j=0;j<productos.length;j++){
                  System.out.println("Digite el numero de una fruta");
                  productos[i][j]=sc.nextLine();
         }
    }
    
         for (int i=0;i<productos.length;i++){
              for (int j=0;j<productos.length;j++){
                  System.out.println(productos[i][j]);

         }
             
         }    }
}