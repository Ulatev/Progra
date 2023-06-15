/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodofunprod;

/**
 *
 * @author Luis Ulate
 */

import java.util.Scanner;

public class metFunProd {
    
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        metFunProd fP = new metFunProd();
        
        
        //Llamado de una funcion//
        System.out.println("La sumatoria es: "+fnSuma());
        //Llamado a 2da funcio//
        System.out.println("La 2da sumatoria es: "+fnSumar(34,7.5));
        
        //Llamado a 2da funcion con la informacio dada por el usuario//
        System.out.println("Digite dos valores a sumar ");
        int s = sc.nextInt();
        double x = sc.nextDouble();
        System.out.println("La 2da sumatoria es: "+fnSumar(s,x));
        
        //Llamado a un metodo
        //Requiere de crear una instancia de la clase donde se encuentra el metodo//
        
        System.out.println("El resultado de la multiplicacion es: " + fP.mMultiplicar());
        
        //Llamado al metodo con parametros
        
        System.out.println("El resultado de la multiplicacion es: " + fP.mMultip(6,9));{
       
        //Llamado a procedimiento
        
        fP.MayorMenor();
        
    }

     
        }
        //Funcion de Sumar sin parametros//
        
        public static double fnSuma(){
            
            int n=8;
            double valor=4;
            double suma=n+valor;
            return suma;
        }
        
        //Funcion Sumas con parametros//
        
        public static double fnSumar(int num, double val){
            
            double suma=num+val;
            return suma;
            
        }



        
        //Metodo multiplicar sin parametros//
        
        double mMultiplicar(){
            
            int d=2;
            int t=6;
            int mult = d*t;
            return mult;
            
        }
        
        //Metodo multiplicar con parametros//
        
        double mMultip(int d, int t){
            
        int mult = d*t;
        return mult;
        
        }
        
        //Procedimiento//
        
        void MayorMenor(){
            
            int edad=18;
            
            if(edad>=18){
                
                System.out.println("Es mayor");
                
            }else {
                
                System.out.println("Es menor");
                
            }
            
        }
                
}
