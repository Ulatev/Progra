/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registros;

/**
 *
 * @Luis Ulate 18/05/2023
 */

public class regFecha {

    int dia;
    String mes;
    int ano;

    public static void main(String[] args) {
        
        //Intancia o creacion de un objeto//
        
        regFecha fecha = new regFecha();
        
        //Almacenar datos//
        
        fecha.dia=18;
        fecha.mes="Mayo";
        fecha.ano=2023;
        
        //Nueva instancia de regFecha//
        
        regFecha fecha1 = new regFecha();
        
        //Almacenar datos//
        
        fecha1.dia=12;
        fecha1.mes="Julio";
        fecha1.ano=2023;
        
        //Impresion de datos de un registro//
        
        System.out.println(fecha.dia+"/"+fecha.mes+"/"+fecha.ano);
        System.out.println(fecha1.dia+"/"+fecha1.mes+"/"+fecha1.ano);
        
        
        
    }
    
    }
    

