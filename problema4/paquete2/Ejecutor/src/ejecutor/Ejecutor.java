
package ejecutor;

import paquete1.SistemaOperativo; 
public class Ejecutor {

    public static void main(String[] args) {
       EquipoCelular equi = new EquipoCelular();
     
        String sistemaOperativo = "IOS";
        String tamanioPantalla = "5.2''";
        double costoInicial = 540;
        double ivaEnPorcentaje = 12;
        String direccionMac = "17:24:C7:E8:B9:98";
        long informacionIMEI = 148963257743698L;   
        
        equi.establecerSistemaOperativo(sistemaOperativo);
        equi.establecerTamanioPantalla(tamanioPantalla);
        equi.establecerCostoInicial(costoInicial);
        equi.establecerIvaEnPorcentaje(ivaEnPorcentaje);
        equi.establecerIvaCostoInicial();
        equi.establecerDireccionMac(direccionMac);
        equi.establecerInformacionIMEI(informacionImei);
        equi.establecerCostoFinal();
        
        System.out.printf("\t**Equipo celular 1**"+"\nSistema Operativo: %s\n"
        +"Tamaño de la pantalla: %s\n"+"Costo Inicial: %.2f\n"+"Iva en Porcentaje: %.2f\n"
        +"Iva del costo Inicial: %.2f\n"+"Dirección MAC: %s\n"+"Información IMEI: %d\n"+"\tCOSTO FINAL: %.2f\n",
        equi.obtenerSistemaOperativo(), equi.obtenerTamanioPantalla(), equi.obtenerCostoInicial(),
        equi.obtenerIvaEnPorcentaje(), equi.obtenerIvaCostoInicial(), equi.obtenerDireccionMac(),
        equi.obtenerInformacionIMEI(),equi.obtenerCostoFinal());
        
        System.out.println("-----------------------------------------------------");
        
        EquipoCelular equi2 = new EquipoCelular();
     
        // Valores de entrada        
        String sistemaOperativo2 = "Android";
        String tamanioPantalla2 = "6.72''";
        double costoInicial2 = 360;
        double ivaEnPorcentaje2 = 12;
        String direccionMac2 = "78:55:A2:G1:S2:0B";
        long informacionImei2 = 458723985163218L;   
        
        equi2.establecerSistemaOperativo(sistemaOperativo2);
        equi2.establecerTamanioPantalla(tamanioPantalla2);
        equi2.establecerCostoInicial(costoInicial2);
        equi2.establecerIvaEnPorcentaje(ivaEnPorcentaje2);
        equi2.establecerIvaCostoInicial();
        equi2.establecerDireccionMac(direccionMac2);
        equi2.establecerInformacionIMEI(informacionIMEI2);
        equi2.establecerCostoFinal();
        
        // Imprimir la información obtenida
        System.out.printf("\t**Equipo celular 2**"+"\nSistema Operativo: %s\n"
        +"Tamaño de la pantalla: %s\n"+"Costo Inicial: %.2f\n"+"Iva en Porcentaje: %.2f\n"
        +"Iva del costo Inicial: %.2f\n"+"Dirección MAC: %s\n"+"Información IMEI: %d\n"+"\tCOSTO FINAL: %.2f\n",
        equi2.obtenerSistemaOperativo(), equi2.obtenerTamanioPantalla(), equi2.obtenerCostoInicial(),
        equi2.CalcularIvaEnPorcentaje(), equi2.obtenerIvaCostoInicial(), equi2.obtenerDireccionMac(),
        equi2.obtenerInformacionIMEI(),equi2.CalcularCostoFinal());        
    }
    }
    
}
