/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.terreno;

/**
 *
 * @author PERSONAL
 */
public class ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
       
         terreno ft = new terreno(); 
         terreno ft2 = new terreno();
        // Valores de entrada
        double ancho = 10;
        double largo = 30;
        double valorMetroCuadrado = 0.15;
        double ancho2 = 10;
        double largo2 = 31;
        double valorMetroCuadrado2 = 0.15;
        ft2.establecerAncho(ancho);
        ft2.establecerLargo(largo);
        ft2.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        
        ft.establecerAncho(ancho2);
        ft.establecerLargo(largo2);
        ft.establecerValorMetroCuadrado(valorMetroCuadrado2);
        
        ft.establecerArea();
        ft.calcularCostoterreno();
       
        System.out.println("-------------------------");
        System.out.println("Precio de Terreno ");
        System.out.printf("Largo del terreno: %.2f\n"
                + "Ancho del terreno: %.2f\nArea del terreno: %.2f\n"
                + "Costo Terreno: %.2f\n", ft.obtenerLargo(),
                ft.obtenerAncho(), ft.obtenerArea(),
                ft.obtenerCostoTerreno());
        
        System.out.println("-------------------------");
        System.out.println("Precio de Terreno (objeto 2) ");
        System.out.printf("Largo del terreno: %.2f\n"
                + "Ancho del terreno: %.2f\nArea del terreno: %.2f\n"
                + "Costo Terreno: %.2f\n", ft2.obtenerLargo(),
                ft2.obtenerAncho(), ft2.obtenerArea(),
                ft2.obtenerCostoTerreno());
        
        
    }  
     
}
