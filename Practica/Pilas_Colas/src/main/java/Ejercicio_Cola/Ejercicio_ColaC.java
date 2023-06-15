/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Cola;

/**
 *
 * @author Luis Ulate
 */

import javax.swing.JOptionPane;

public class Ejercicio_ColaC {
    
//Asignamos el comportamiento de una cola
private Ejercicio_ColaN inicio, fin;
String Cola="";//Para saber el contenido de la cola//
    

//Constructor de la cola//

public Ejercicio_ColaC(){
    
inicio=null;
fin=null;
    
}


//Metodos del programa(Cola vacia)//

public boolean ColaVacia(){

if(inicio==null){
    
    return true;
    
}else{
    
    return false;
}
    
}

//Insercion en la cola//

public void Insertar(String info){
    
Ejercicio_ColaN nuevoNodo=new Ejercicio_ColaN();
nuevoNodo.info=info;
nuevoNodo.siguiente=null;

if(ColaVacia()){
inicio=nuevoNodo;
fin=nuevoNodo;
     
}else{
    
fin.siguiente=nuevoNodo;
fin=nuevoNodo;
    
} 
}

//Extraccion de la cola

public String Extraer(){
    
if(!ColaVacia()){
String dato=inicio.info;

if(inicio==fin){
    inicio=null;
    fin=null;
    
}else{
    
inicio=inicio.siguiente;    
    
}
 return dato;   
}else{
    
return "";    
}     
}

//Mostrar el contenido//

public void MostrarCola(){
    
Ejercicio_ColaN buscar=inicio;
String ColaInvertida=""; //Invertimos una cadena de texto//

while(buscar!=null){
    
Cola += buscar.info + " ";    
buscar=buscar.siguiente;

}
    
String cadena[]=Cola.split(" ");
//Para invertir la cadena creada con los espacios correctos//

for(int i=cadena.length-1;i>0;i--){
    
ColaInvertida += "" + cadena[i];    
    
}

JOptionPane.showMessageDialog(null,ColaInvertida);
Cola="";

}    
}
