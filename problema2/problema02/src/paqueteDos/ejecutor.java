/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

import paqueteUno.EquivalenteHora;

/**
 *
 * @author PERSONAL
 */
public class ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
       
         EquivalenteHora ft = new EquivalenteHora(); 
         EquivalenteHora ft2 = new EquivalenteHora();
       
        // Valores de entrada
        int cantidadHoras1 = 24;
        
        ft2.establecerCantidadHoras(cantidadHoras1);
        ft2.establecerMinutos();
        ft2.establecerDias();
        ft2.establecerSegundos();
       
        
        int cantidadHoras = 40;
        
        ft.establecerCantidadHoras(cantidadHoras);
        ft.establecerMinutos();
        ft.establecerDias();
        ft.establecerSegundos();
        
       
         System.out.println("-------------------------");
        System.out.println("Conversion de horas (objeto 1)");
        System.out.printf("Horas: %.2f\n"
                + "Dias: %.2f\n"
                + "Minutos: %.2f\n"
                + "Segundos: %.2f\n", ft.obtenerCantidadHoras(),
                ft.obtenerDias(), ft.obtenerMinutos(),
                ft.obtenerSegundos());
        
        
        
        System.out.println("-------------------------");
        System.out.println("Conversion de horas (objeto 1)");
        System.out.printf("Horas: %.2f\n"
                + "Dias: %.2f\n"
                + "Minutos: %.2f\n"
                + "Segundos: %.2f\n", ft2.obtenerCantidadHoras(),
                ft2.obtenerDias(), ft2.obtenerMinutos(),
                ft2.obtenerSegundos());        
        
    }  
}
