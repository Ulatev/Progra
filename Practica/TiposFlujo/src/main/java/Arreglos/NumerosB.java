/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author Luis Ulate 02/05/2023
 */

public class NumerosB {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese la capacidad del arreglo");
        int cant = sc.nextInt();
        
        float [] numeros = new float [cant];
       
        
        for(int i=0;i<cant;i++){
           
        System.out.println("Ingrese un valor para cada numero");
        float num= sc.nextFloat();
        
        if(Numeros(num)==true){
            
        numeros[i]=num;
            
        }else{
         
            System.out.println("Los numeros ingresados son impares");  
        }   
        System.out.println(numeros[i]);
    }
        ;
        
        System.out.println("La dimension del arreglo es de: "+cant+" [1]");
        System.out.println("El indice maximo del arreglo es: "+cant);
        System.out.println("El tipo de datos que almacena son: Tipo Float");
        System.out.println("Tipo de arreglo usado: Unidimensional");
        
    }
        public static boolean Numeros(float num){
        
        return num%2==0;
        }
}

//flota porque almacena numeros con parte enteros y decimal//
//metodo o funcion//