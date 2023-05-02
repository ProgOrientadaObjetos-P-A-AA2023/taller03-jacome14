/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author PERSONAL
 */
public class terreno {

    
    private double valorMetroCuadrado;
    private double largo;
    private double area;
    private double ancho;
    private double costo_Terreno;
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerArea(){
        area = largo * ancho;
    }
    
    // public void establecerValorFactura(){
    public void calcularCostoterreno(){
        costo_Terreno = valorMetroCuadrado * area;
    }
    
    
    public double obtenerValorMetroCuadrado(){
        return  valorMetroCuadrado;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
     public double obtenerArea(){
        return area;
    }
    public double obtenerCostoTerreno(){
        return costo_Terreno;
    }
    
    
}
