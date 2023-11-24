/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazconversiones;
/**
 *
 * @author Luis Ulate
 * @version 2.0
 * @since 26/07/2023
 */
public class Conversiones {
    

    /**
    Converite de entero a binario
    @param dato es el dato que sera convertido a binario
    @since 26/07/2023
    @version 2.0
    @return retorna el numero a binario
     */                    
    public String converBinarios(String dato){
            int number = Integer.parseInt(dato);
            return Integer.toBinaryString(number);
    }
    
    /**
    Cantidad de cifras
    @param dato es el dato al que se extraeran la cantidad de cifras
    @since 26/07/2023
    @version 2.0
    @return retorna un string indicando la cantidad de cifras
     */
    public String CantCifras(String dato){
            return String.valueOf(dato.length());   
    }
    
    /**
    Converciones de colones a dolares,euros,libras y yenes
    
    @param num es el dato con el que trabjara como colones
    @param op indica que tipo de moneda se desea convertir
    @since 24/07/2023
    @version 2.0
    @return retorna el valor de la moneda despues de la conversion del tipo de moneda ingresado
     */
    public String converMon(String num,String op){
        double number; 
            
        number = Double.parseDouble(num);
        
        switch (op){
            case "Dolares":
                return Double.toString(number / 541.71);
            case "Euros":
                return Double.toString(number / 594.05);
            case "Libras":
                return Double.toString(number / 693.75);
            case "Yenes":
                 return Double.toString(number / 3.83);
        }
        return null;
    }

    /**
     * comprueba si un numero es primo o no 
     * 
     * @param num es el numero con el que se valida si es primo o no
     * @since 24/07/2023
     * @version 2.0
     * @return retorna indicando si es primo o no
     */
    public String Primo(String num){
            double numero = Double.parseDouble(num);

            for (int x = 2; x < numero / 2; x++) {
              if (numero % x == 0)
                return "No es primo";
            }
            return "Es primo";    
    }

    /**
    comprueba que el dato ingresado sea un numero entero
    @param dato es el dato que sera procesado
    @since 24/07/2023
    @version 2.0
    @return retorna true si es numerico, sino false
    */
    public boolean isNumericInt(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;}
    }
    
    /**
     * comprueba que el numero ingresado sea un numero double
     * 
     * @param dato es el dato que sera procesado
     * @since 26/07/2023
     * @version 2.0
     * @return retorna true si es valido, sino false
     */
    public boolean isNumericDouble(String dato) {
        try {
            Double.parseDouble(dato);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;}
    }    
}

