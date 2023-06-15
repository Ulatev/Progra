/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Ulate 09-03-2023
 */

//Ejercicio '3'

import java.util.Scanner;

public class TablasMultiplicar {

public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero para las tablas de multiplicar"
    + "\n 1.Tabla del '1'"
    + "\n 2. Tabla del '2'"
    + "\n 3. Tabla del '3'"
    + "\n 4. Tabla del '4'"
    + "\n 5. Tabla del '5'"
    + "\n 6. Tabla del '6'");
    int tablas = sc.nextInt();
    
    switch(tablas){
        
        case 1:
            
            System.out.println("La tabla del '1' es:"
                    + "\n1x1=1"
                    + "\n1x2=2"
                    + "\n1x3=3"
                    + "\n1x4=4"
                    + "\n1x5=5"
                    + "\n1x6=6"
                    + "\n1x7=7"
                    + "\n1x8=8"
                    + "\n1x9=9"
                    + "\n1x10=10");
            break;
            
        case 2:
            
            System.out.println("La tabla del '2' es:"
                    + "\n2x1=2"
                    + "\n2x2=4"
                    + "\n2x3=6"
                    + "\n2x4=8"
                    + "\n2x5=10"
                    + "\n2x6=12"
                    + "\n2x7=14"
                    + "\n2x8=16"
                    + "\n2x9=18"
                    + "\n2x10=20");
            break;
            
        case 3:
            
            System.out.println("La tabla del '3' es: "
                    + "\n3x1=3"
                    + "\n3x2=6"
                    + "\n3x3=9"
                    + "\n3x4=12"
                    + "\n3x5=15"
                    + "\n3x6=18"
                    + "\n3x7=21"
                    + "\n3x8=24"
                    + "\n3x9=27"
                    + "\n3x10=30");
            break;
            
        case 4:
            System.out.println("La tabla del '4' es: "
                    + "\n4x1=4"
                    + "\n4x2=8"
                    + "\n4x3=12"
                    + "\n4x4=16"
                    + "\n4x5=20"
                    + "\n4x6=24"
                    + "\n4x7=28"
                    + "\n4x8=32"
                    + "\n4x9=36"
                    + "\n4x19=40");
            break;
            
        case 5:
            
            System.out.println("La tabla del '5' es: "
                    + "\n5x1=5"
                    + "\n5x2=10"
                    + "\n5x3=15"
                    + "\n5x4=20"
                    + "\n5x5=25"
                    + "\n5x6=30"
                    + "\n5x7=35"
                    + "\n5x8=40"
                    + "\n5x9=45"
                    + "\n5x10=50");
            break;
            
        case 6:
            
            System.out.println("La tabla del '6' es: "
                    + "\n 6 x 1 = 6" +
                    "6 x 2 = 12\n" +
                    "6 x 3 = 18\n" +
                    "6 x 4 = 24\n" +
                    "6 x 5 = 30\n" +
                    "6 x 6 = 36\n" +
                    "6 x 7 = 42\n" +
                    "6 x 8 = 48\n" +
                    "6 x 9 = 54\n" +
                    "6 x 10 = 60 ");
        break;
            
        default:
            
            System.out.println("La opcion no es valida");
            
    }
    
}
    
}
