/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Cola;

import javax.swing.JOptionPane;

/**
 *
 * @author CTPG
 */
public class Ejercicio_ColaP {

    public static void main(String[] args) {
        
    
    
int menu=0;
String Dato_Nodo;
Ejercicio_ColaC cola=new Ejercicio_ColaC();
        
do{
    
  try{
      
     menu = Integer.parseInt((JOptionPane.showInputDialog(null,
             "Opciones de la cola \n\n"
           + "1. Mostrar Cola \n"
           + "2. Insertar un Nuevo Nodo \n"
           + "3. Extraer Nodo \n"
           + "4. Salir \n\n")));
      
  switch(menu){
      
   case 1:
          cola.MostrarCola();
          break;
    case 2:
          Dato_Nodo=JOptionPane.showInputDialog(null,
          "Digite el nombre a incluir en el nodo");
      
          cola.Insertar(Dato_Nodo);
          break;
    case 3:
        if(!cola.ColaVacia()){
            
            JOptionPane.showMessageDialog(null,"Se extrajo un nodo con el valor: "+cola.Extraer());
            
        }else{
            
            JOptionPane.showMessageDialog(null,"La cola esta vacia");
            
        }
          break;
    case 4:
        menu=4;
         break;
    default:
        JOptionPane.showMessageDialog(null,"La opcion seleccionada no esta dentro del menu");
    
  }   
      
  } catch (NumberFormatException e){
     
      
  } 
    
    
}while(menu!=4);


}
        
    }
    

