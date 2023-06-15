/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_pila;

/**
 *
 * @author Luis Ulate 1/06/2023
 */

public class Pila {
    
//Asignamos el comportamiento de una pila//

private Ejemplo_Pila.Nodo inicio, fin;
String Pila=""; //Para saber el contenido de la cola//

//Constructor de la cola//

public Pila(){
    
    inicio=null;
    fin=null;
    
}

//Metodo del programa (Cola Vacia)//

public boolean PilaVacia(){
    
    if(inicio==null){
        
        return true;
        
    }else{
        
        return false;
        
    }
    
}

public void Insertar (int valor){
    
Ejemplo_Pila.Nodo nuevoNodo = new Ejemplo_Pila.Nodo();
    
nuevoNodo.valor=valor;
nuevoNodo.siguiente=null;

if(PilaVacia()){

inicio=nuevoNodo;
fin=nuevoNodo;
    
}else{
    
    fin.siguiente=nuevoNodo;
    fin=nuevoNodo;
    
}

}

}


