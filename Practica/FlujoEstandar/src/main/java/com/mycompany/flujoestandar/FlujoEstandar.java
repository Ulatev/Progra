/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flujoestandar;

/**
 *
 * @author Luis Ulate 4/11/2023
 */

import java.util.Scanner;

public class FlujoEstandar {

    public static void main(String[] args) {
        
        //Instancio de la clase escaner con combre sc
        
        Scanner sc = new Scanner (System.in);
        
        String num1, num2;
        
        System.out.println("Digite dos numeros que esten entre 0 y 10");
    
        num1 = sc.nextLine();
        num2 = sc.nextLine();
        
        if(!num1.isEmpty()&&!num2.isEmpty()){
            
            System.out.println("");
            
        }
        
        //realizar la sumatoria de los numeros solo si estan dentro del rango
        
        int aux1, aux2;
        int sumatoria;
        
        if(isNumerico(num1)){
            
            
        }
        
    }
    
    public static boolean isNumerico (String cadena){
        
        try{
          
         Integer.parseInt(cadena);//Convertir de string a int 
            
        }catch (NumberFormaException nfe)
        
    }return true;
    
}
