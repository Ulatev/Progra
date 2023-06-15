/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Ejercicio_Cola1;

/**
*
* @author Luis Ulate 
*/

import javax.swing.JOptionPane;

public class ColaC {
    
   //Asignamos el comportamiento de una cola
private ColaN inicio, fin;
int Cola=0;//Para saber el contenido de la cola//
    

//Constructor de la cola//

public ColaC(){
    
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

public void Insertar(int info){
    
ColaN nuevoNodo=new ColaN();
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

public int Extraer(){
    
if(!ColaVacia()){
int dato=inicio.info;

if(inicio==fin){
    inicio=null;
    fin=null;
    
}else{
    
inicio=inicio.siguiente;    
    
}
 return dato;   
}else{
    
return Integer.MAX_VALUE;    
}     
}

//Mostrar el contenido//

public void MostrarCola(){
    
ColaN buscar=inicio;
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

    

