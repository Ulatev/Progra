/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

import java.util.Scanner;

/**
 *
 * @author Luis Ulate 24/05/2023
 */


public class Ejercicio3 {

String nombre, inicial, genero;
int edad;
double estatura , peso;
    
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);   
Ejercicio3 datos1[] = new Ejercicio3[20];

for(int i=0;i<datos1.length;i++){
    
datos1[i]=new Ejercicio3(); 

System.out.println("Ingrese su nombre");
datos1[i].nombre = sc.nextLine();

System.out.println("Ingrese la inicial de su nombre");
datos1[i].inicial = sc.nextLine();

System.out.println("Ingrese su edad");
datos1[i].edad = sc.nextInt();

System.out.println("Ingrese su genero");
datos1[i].genero = sc.nextLine();
datos1[i].genero = sc.nextLine();

System.out.println("Ingres su estatura");
datos1[i].estatura = sc.nextDouble();

System.out.println("Ingrese su peso en Kg");
datos1[i].peso = sc.nextDouble();
sc.nextLine();

}
    }
    
}
