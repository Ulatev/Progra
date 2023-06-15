package Estruct_Seleccion;

/**
 *@author Luis Ulate 02-03-2023
 * 
 *///Ejercicios 2 - C



import java.util.Scanner;

public class Agricultor {
       
public static void main (String[]args ){
        
    double precio;
    int fruta;
    int calidad;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese el precio del kilo de sandia");
    precio = sc.nextDouble();
    
    System.out.println("Ingrese un numero para escoger el tipo de fruta \n1-Ketsal\n2-Lavon ");
    fruta = sc.nextInt();
    
    System.out.println("Ingrese un numero para escoger la calidad de la fruta \n1-Buena\n2-Excelente");
    calidad = sc.nextInt();
    
    switch (fruta){
                  
        case 1://Kesali
            
            switch(calidad){
                
         case 2://Calidad buena
            
            precio += precio * 0.20;
        
            break;
        
        case 3://Calidad excelente
            
            precio += precio * 0.40;
        
        default:
            
            System.out.println("Indefinido");
            
            }
            
            switch (calidad){
                
                
        case 1://Calidad buena 
                    
           precio += precio * 0.15;
                    
            break;    
                
        case 2://Calidad excelente
            
           precio += precio * 0.45;
            
           break;
        
        default:
            
            System.out.println("Indefinido");
           
            }
            
        }
    
        System.out.println("El precio total es de:" + precio);
    
    
}
    
}
    

