/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

/**
 *
 * @author Luis Ulate 18/05/2023
 */


public class Ejercicio1 {

String tipo, marca, modelo;
String cilindraje;
String capacidad;

public static void main(String[] args) {


//Instancia//

Ejercicio1 carro1 = new Ejercicio1();
Ejercicio1 carro2 = new Ejercicio1();
Ejercicio1 carro3 = new Ejercicio1();
Ejercicio1 carro4 = new Ejercicio1();


carro1.tipo="Off-Road";
carro1.marca="Toyota";
carro1.modelo="Land Cruiser";
carro1.cilindraje="4461cc";
carro1.capacidad="5 a 7";

carro2.tipo="Suv";
carro2.marca="Geely";
carro2.modelo="GX3";
carro2.cilindraje="1500cc";
carro2.capacidad="5";

carro3.tipo="Muscle";
carro3.marca="Ford";
carro3.modelo="Mustang gt3";
carro3.cilindraje="4*5";
carro3.capacidad="2";

carro4.tipo="Coupe";
carro4.marca="Audi";
carro4.modelo="R8";
carro4.cilindraje="5.204";
carro4.capacidad="5";

    System.out.println("Tipo: "+carro1.tipo);
    System.out.println("Mrca: "+carro1.marca);
    System.out.println("Modelo: "+carro1.modelo);
    System.out.println("Cilindrada: "+carro1.cilindraje);
    System.out.println("Capacidad de personas: "+carro1.capacidad);
    
    System.out.println("");
    
    System.out.println("Tipo: "+carro2.tipo);
    System.out.println("Mrca: "+carro2.marca);
    System.out.println("Modelo: "+carro2.modelo);
    System.out.println("Cilindrada: "+carro2.cilindraje);
    System.out.println("Capacidad de personas: "+carro2.capacidad);
    
    System.out.println("");
    
    System.out.println("Tipo: "+carro3.tipo);
    System.out.println("Mrca: "+carro3.marca);
    System.out.println("Modelo: "+carro3.modelo);
    System.out.println("Cilindrada: "+carro3.cilindraje);
    System.out.println("Capacidad de personas: "+carro3.capacidad);
    
    System.out.println("");
    
    System.out.println("Tipo: "+carro4.tipo);
    System.out.println("Mrca: "+carro4.marca);
    System.out.println("Modelo: "+carro4.modelo);
    System.out.println("Cilindrada: "+carro4.cilindraje);
    System.out.println("Capacidad de personas: "+carro4.capacidad);
    
    }
    
}
