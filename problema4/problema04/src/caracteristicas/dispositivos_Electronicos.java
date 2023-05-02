/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteristicas;

/**
 *
 * @author PERSONAL
 */
public class dispositivos_Electronicos {
     private String sistemaOperativo;
    private String imei;
    private String mac;
    private double pantalla;
    private double costoInicial;
    private double iva;
    private double ivaInicial;
    private double costoFinal;
    
    public void establecerSO(String c){
        sistemaOperativo = c;
    }
     public void establecerImei(String c){
       imei = c;
    }
    
    public void establecerMac(String c){
        mac = c;
    }
     public void establecerPantalla(double c){
        pantalla = c;
    }
     public void establecerIva (double c){
     iva = c;
     }
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    
    public void calcularIvaInicial(){
        ivaInicial = (costoInicial*iva)/100;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaInicial;
    }
    
    
    
    
    public String obtenerSO(){
        return  sistemaOperativo;
    }
    
    public double obtenerPantalla(){
        return pantalla;
    }
    
    public String obtenerImei(){
        return imei;
    }
      public String obtenerMac(){
        return mac;
    }
        public double obtenerCostoInicial(){
        return costoInicial;
    }
     public double obtenerIva(){
        return iva;
       
    }
     public double obtenerIvaInicial(){
        return ivaInicial;
       
    }
     public double obtenerCostoFinal(){
        return costoFinal;
       
    }
}
