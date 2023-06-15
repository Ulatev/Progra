package Estruct_Seleccion;
/**
 *
 * @author Luis Ulate 02-03-2023
 */

import java.util.Scanner;

public class NumerosParesOImpares {
   
public static void main (String [] args ){
    
int num1;
int resultado;
Scanner sc = new Scanner (System.in);
   
 //Ejercicio (2 - b)

    System.out.println("Digite cualquier numero");//Peticion de los datos
    num1 = sc.nextInt();

if (num1 % 2 == 0){//Buscar residuo = 0
    
    System.out.println("El numero digitado es par");
     
}

else {
       
    System.out.println("El numero dititado es impar ");//Buscar residuo distinto = 0
    
}
   
    num1 *= 2 ;
    System.out.println("El numero incrementado al doble es de:" + num1 );//Salida de datos
}        
}
