package com.mycompany.operadores;

/**
 *Luis Ulate 22/02/2023
 * 
 */
public class Operadores {

    public static void main(String[] args) {
    
   int num = 0;
   int num1 = 5;
   double num2 = 8.65;
   double num3 = 3.4;
   float num4 = 12.5f;
   
   
   //Operadores aritmeticos
   //Suma
   
   double suma = num2+ num1;
   
    //resta
   float resta = num4 - num;
     
   //Multiplicación
   
   int multiplicacion = num * num1;
   
    //Division
    
    double division = num2 / num1;
    
    //Determinar el resto de una division
    
    double restoDivision = num2 % num1;
    
    //Potencia 
    
    int potencia = num1 ^ 2 ;
    
    //Operadores relacionales
    
    boolean comparacion1 = (num1 == num2) ; //igualdad
    boolean comp2 = (num1 != num2); // diferente de 
    boolean comp3 = (num1 > num2); // mayor que
    boolean comp4 = (num1 < num2); // menor que 
    boolean comp5 = (num1 >= num2); // Mayor o igual que
    boolean comp6 = (num1 <= num2); // Menor o igual que 
    
    //Operador incremental
    
    num1++;
    
    //Operador decremental
    
    num1--;
    
    }
}
