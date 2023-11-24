/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopractice;

/**
 *
 * @author Luis Ulate
 */
public class Producto {
    
    private double PCosto;
    private double PVenta;
    private String cod_Produ;
    private String descrip;
 
    public Producto(String cod_Producto, String descripcion,double precioCosto, double precioVenta){
        this.cod_Produ = cod_Producto;
        this.descrip = descripcion;
        this.PCosto = precioCosto;
        this.PVenta = precioVenta;   
    }
    
    public String getCod_Producto(){
        return cod_Produ;
    }
    
    public void setCod_Producto(String cod_Producto){
        this.cod_Produ = cod_Producto;
    }
    

    public String getDescripcion(){
        return descrip;
    }  
    
    public void setDescripcion(String descripcion){
        this.descrip = descripcion;
    }

    public double getPrecioCosto(){
        return PCosto;
    }

    public void setPrecioCosto(double precioCosto){
        this.PCosto = precioCosto;
    }    

    public double getPrecioVenta(){
        return PVenta;
    }
    
    public void setPrecioVenta(double precioVenta){
        this.PVenta = precioVenta;
    }
}
