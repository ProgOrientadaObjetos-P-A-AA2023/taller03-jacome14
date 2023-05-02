package ejecutor;
import paquete1.Terreno; 
public class Ejecutor {

    
    public static void main(String[] args) {
        Terreno terre = new Terreno();
        

        double ancho = 55;
        double largo = 42;
        double valorMetroCuadrado = 20.36;
        
        terre.establecerAncho(ancho);
        terre.establecerLargo(largo);
        terre.establecerValorMetroCuadrado(valorMetroCuadrado);
        terre.establecerArea();
        terre.establecerCostoTerreno();
        
        System.out.printf("\tCosto de un Terreno \n\nAncho: %.2f \nLargo: %.2f "
                + " \nArea: %.2f \nValor Metro Cuadrado: %.2f \n\tCosto del  "
                + "Terreno: %.2f\n", terre.obtenerAncho(), terre.obtenerLargo(), 
                    terre.obtenerArea(), terre.obtenerValorMetroCuadrado(),     
                    terre.obtenerCostoTerreno());
        
        System.out.println("---------------------------------------------");
        
        Terreno terre2 = new Terreno();
        
        double ancho2 = 80;
        double largo2 = 30;
        double valorMetroCuadrado2 = 50;
        
        terre2.establecerAncho(ancho2);
        terre.establecerLargo(largo2);
        terre2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        terre2.establecerArea();
        terre2.establecerCostoTerreno();
        
        System.out.printf("\n\tCosto de un Terreno \n\nAncho: %.2f \nLargo: %.2f "
                + " \nArea: %.2f \nValor Metro Cuadrado: %.2f \n\tCosto del  "
                + "Terreno: %.2f\n", terre2.obtenerAncho(), terre.obtenerLargo(), 
                    terre.obtenerArea(), tere2.obtenerValorMetroCuadrado(),     
                    terre2.obtenerCostoTerreno());
        
    }
    
}
