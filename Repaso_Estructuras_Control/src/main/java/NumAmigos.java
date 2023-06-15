/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Luis Ulate 09-03-2023
 */

//Ejeciocio '4'

import java.util.Scanner;

public class NumAmigos {
    
    public static void main (String[]args){
        
        Scanner sc= new Scanner(System.in);
        double residuo;
        
        System.out.println("Ingrese el primer numero");
        double num1= sc.nextDouble();
        
        System.out.println("Ingrese el segundo numero");
        double num2= sc.nextDouble();  
        
        residuo = num1%3;
    
        if(residuo==00&&num1>0&&num2>0){
            
            System.out.println("Los numeros son amigos");
            
        }else{
            
            System.out.println("Los numeros no son amigos");  
        }
}
}