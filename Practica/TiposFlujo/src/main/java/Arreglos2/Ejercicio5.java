/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos2;

/**
 *
 * @author CTPG
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        
        String [][]produ = new String [4][5];
     
        produ[0][0] = "Menta";
        produ[0][1] = "Curcuma";
        produ[0][2] = "Culantro";
        produ[0][3] = "Mejorana";
        produ[0][4] = "Salvia";

        produ[1][0] = "Comino";
        produ[1][1] = "Ajo    ";
        produ[1][2] = "Cilantro";
        produ[1][3] = "Romero";
        produ[1][4] = "Cebollin";
        
        produ[2][0] = "Perejil";
        produ[2][1] = "Curri";
        produ[2][2] = "Laurel";
        produ[2][3] = "Albahaca";
        produ[2][4] = "Calendula";
        
        produ[3][0] = "Oregano";
        produ[3][1] = "Pimienta";
        produ[3][2] = "Tomillo";
        produ[3][3] = "Hierbabuena";
        produ[3][4] = "Manzanilla";
       
        
        for(int i=0;i<4;i++){
            System.out.println();
            
        for(int j=0;j<5;j++){
            
            System.out.print(produ[i][j]);    
           
        if (i!=produ[j].length)System.out.print("\t   ");
            
        }     
        }
        
    }
    
}
