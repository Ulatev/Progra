/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

/**
 *
 * @author Luis Ulate 18/05/2023
 */

public class ArrayRegFecha {

//Atributos (dia, mes, ano)//
    
    int dia;
    String mes;
    int ano;
    
    public static void main(String[] args) {
        
        //Crear arreglo del registro//
        
        ArrayRegFecha arrayFecha[] = new ArrayRegFecha[3];
        
        //Inicializar el elemento 0 del arreglo//
        
        arrayFecha[0]= new ArrayRegFecha();
        arrayFecha[1]= new ArrayRegFecha();
        arrayFecha[2]= new ArrayRegFecha();
        
        //Llenar los campos del elemento 0 del arreglo//
        
        arrayFecha[0].dia=5;
        arrayFecha[0].mes="Agosto";
        arrayFecha[0].ano=2022;
        
        //Llenar los campos del elemento 1 del arreglo//
        
        arrayFecha[1].dia=8;
        arrayFecha[1].mes="Enero";
        arrayFecha[1].ano=2021;
        
        //Llenar los campos del elemento 2 del arreglo//
        
        arrayFecha[2].dia=15;
        arrayFecha[2].mes="Febrero";
        arrayFecha[2].ano=2006;
        
        //Imprimir los datos del elemento 0//
        
        System.out.println(arrayFecha[0]);
        
        
        
        
    }
    
}
