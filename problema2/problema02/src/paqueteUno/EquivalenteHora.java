/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteUno;

/**
 *
 * @author PERSONAL
 */
public class EquivalenteHora {

    
    private double cantidadHoras;
    private double minutos;
    private double segundos;
    private double dias;
    
    
   
   
    public void establecerCantidadHoras(double c){
        cantidadHoras = c;
    }
    
    public void establecerMinutos(){
        minutos = cantidadHoras *60;
    }
    public void establecerSegundos(){
        segundos = cantidadHoras*3600;
    }
    
    public void establecerDias(){
        dias = cantidadHoras/ 24;
    }
    
    
    
    
    public double obtenerCantidadHoras(){
        return  cantidadHoras;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
     public double obtenerDias(){
        return dias;
    }
    
   
    
}
