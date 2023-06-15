/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Luis Ulate 27/04/2023
 */

import java.util.Scanner;

public class Unidimensional {

    public static void main(String[] args) {
        
        //Arreglo para almacenar nombres de medicinas//
        
        String [] medicinas = new String [9];//Corchetes antes del nombre//
        String medicinasN [] = new String [9];//Corchetes despues del nombre//
        Scanner sc = new Scanner(System.in);
        
        //Llenar el arreglo//
        
        medicinas [0] = "Acetaminofen";
        medicinas [1] = "Penicilina";
        medicinas [2] = "Ibuprofeno";
        medicinas [3] = "Alergial";
        medicinas [4] = "Tramal";
        medicinas [5] = "Trembolona";
        medicinas [6] = "Panadol";
        medicinas [7] = "Dexametasona";
        medicinas [8] = "Suero";
        
        //Llenado de arreglo con for//
        
        for (int i =0;i<=medicinasN.length;i++){
            
            System.out.println("Indique el nombre del medicamnento");
            medicinasN [i] = sc.nextLine();
            
        }
        
        //imprimir arreglo manualmente//
        
             System.out.println(  "0"+" ["+ medicinasN[0]+"]" 
                             +"\t 1 "+" ["+ medicinasN[1]+"]"
                             +"\t 2 "+" ["+ medicinasN[2]+"]"
                             +"\t 3 "+" ["+ medicinasN[3]+"]"
                             +"\t 4 "+" ["+ medicinasN[4]+"]"
                             +"\t 5 "+" ["+ medicinasN[5]+"]"
                             +"\t 6 "+" ["+ medicinasN[6]+"]"
                             +"\t 7 "+" ["+ medicinasN[7]+"]"
                             +"\t 8 "+" ["+ medicinasN[8]+"]");
        
        
        //Imprimir con metodo to String//
        
        System.out.println(medicinasN.toString());

        //Imprimir arreglo con un for//

        for (int i=0;i<medicinasN.length;i++){
            
            System.out.println(medicinasN[i]);
            
        }
        
        //Arreglo para almacenar la estatura de 8 personas//
        
        double arrayEstatura []= new double[8];
        
        //Llenando el arreglo//
        
        for(int i=0;i <= arrayEstatura.length;i++){
            
        arrayEstatura[i] = sc.nextDouble();
            
        }
        
        //Impresion del for//
        
        System.out.println(arrayEstatura.toString());
        
        //Arreglo para almacenar las iniciales de los nombres de 6 personas//
        
        String arrayInicial[]= new String[6];
        
        //Llenando el arreglo
        
        for(int i=0;i<=arrayInicial.length;i++){
        arrayInicial[i] = sc.nextLine();
        
            
        }
        
    }
    
}
