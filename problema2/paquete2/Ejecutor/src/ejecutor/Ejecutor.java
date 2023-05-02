package ejecutor;

import paquete1.EquivalenteHora; 
public class Ejecutor {

    
    public static void main(String[] args) {
        EquivalenteHora hora = new EquivalenteHora();
        
        double horas = 40;
        
        horas.establecerHoras(horas);
        horas.establecerMinutos();
        horas.establecerSegundos();
        horas.establecerDias();
        
        //Se presenta los datos
        System.out.printf("\tEquivalente Horas\n\nHoras: %.2f \nEquivalente en minutos: %.2f \n"
                + "Equivalente en segundos: %.2f \nEquivalente en Días: %.2f\n\n", horas.obtenerHoras(),     
                horas.obtenerMinutos(), horas.obtenerSegundos(), horas.obtenerDias());
        
        System.out.println("----------------------------------------");
        
        EquivalenteHora hora2 = new EquivalenteHora();

        double horas2 = 125.5;
        
        hora2.establecerHoras(horas2);
        hora2.establecerMinutos();
        hora2.establecerSegundos();
        hora2.establecerDias();
        
        System.out.printf("\tEquivalente Horas\n\nHoras: %.2f \nEquivalente en minutos: %.2f \n"
                + "Equivalente en segundos: %.2f \nEquivalente en Días: %.2f\n", hora2.obtenerHoras(),     
                hora2.obtenerMinutos(), hora2.obtenerSegundos(), hora2.obtenerDias());
        
    }
    
}
