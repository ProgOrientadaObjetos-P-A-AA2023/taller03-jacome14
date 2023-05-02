/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import caracteristicas.dispositivos_Electronicos;

/**
 *
 * @author PERSONAL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dispositivos_Electronicos ft = new dispositivos_Electronicos(); 
         dispositivos_Electronicos ft2 = new dispositivos_Electronicos(); 
      
        // TODO code application logic here
        
        /*private String sistemaOperativo;
    private String imei;
    private String mac;
    private double pantalla;
    private double costoInicial;
    private double iva;
    private double ivaInicial;
    private double costoFinal;*/
    
    // Valores de entrada
       String sistemaOperativo = "Android";
       String imei = "1234455ffsdg13412";
       String mac = "124345gfsdq2313456";
       double  pantalla= 6.5;
       double costoInicial=56.50;
       double  iva=12;
      
        ft.establecerSO(sistemaOperativo);
        ft.establecerImei(imei);
        ft.establecerMac(mac);
        ft.establecerPantalla(pantalla);
        ft.establecerCostoInicial(costoInicial);
        ft.establecerIva(iva);
        ft.calcularIvaInicial();
        ft.calcularCostoFinal();
        
        
     String sistemaOperativo1 = "IOS";
       String imei1 = "122346563394fds";
       String mac1 = "738940582119h356";
       double  pantalla1= 7.5;
       double costoInicial1=100;
       double  iva1=12;
      
        ft.establecerSO(sistemaOperativo1);
        ft.establecerImei(imei1);
        ft.establecerMac(mac1);
        ft.establecerPantalla(pantalla1);
        ft.establecerCostoInicial(costoInicial1);
        ft.establecerIva(iva1);
        ft.calcularIvaInicial();
        ft.calcularCostoFinal();
        
       
        
       
         System.out.println("-------------------------");
        System.out.println("Caracteristica de dispositivo electronico (objeto 1) ");
        System.out.printf("Sistema Operativo: %s\n"
                + "Tamaño de pantalla: %.1f\n"
                + "IMEI:%s\n"
                + "MAC: %s\n"
                + "IVA: %.1f\n"
                + "Costo Inicial: %.2f\n"
                + "Iva Inicial: %.2f\n"
                + "Costo Final: %.2f\n", ft.obtenerSO(),
                ft.obtenerPantalla(), ft.obtenerImei(),ft.obtenerMac(),
                ft.obtenerIva(),ft.obtenerCostoInicial(),ft.obtenerIvaInicial()
                ,ft.obtenerCostoFinal());
        
        
        
        System.out.println("-------------------------");
        System.out.println("Caracteristica de dispositivo electronico (objeto 2) ");
        System.out.printf("Sistema Operativo: %s\n"
                + "Tamaño de pantalla: %.1f\n"
                + "IMEI:%s\n"
                + "MAC: %s\n"
                + "IVA: %.1f\n"
                + "Costo Inicial: %.2f\n"
                + "Iva Inicial: %.2f\n"
                + "Costo Final: %.2f\n", ft.obtenerSO(),
                ft.obtenerPantalla(), ft.obtenerImei(),ft.obtenerMac(),
                ft.obtenerIva(),ft.obtenerCostoInicial(),ft.obtenerIvaInicial()
                ,ft.obtenerCostoFinal());
        
        
        
    }  
    }  

    
    

