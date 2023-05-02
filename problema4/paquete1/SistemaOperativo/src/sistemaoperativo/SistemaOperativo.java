
package sistemaoperativo;


public class SistemaOperativo {

    
    public static void main(String[] args) {
        
    }
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaEnPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private long informacionImei;
    
    public void establecerSistemaOperativo(String so) {
        sistemaOperativo = so;
    }
    
    public void establecerTamanioPantalla(String pantalla) {
        tamanioPantalla = pantalla;
    }
    
    public void establecerCostoInicial(double costoi) {
        costoInicial = costoi;
    }
    
    public void establecerIvaEnPorcentaje(double ivap) {
        ivaEnPorcentaje = ivap;
    }

    public void establecerIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaEnPorcentaje/100);
    }    
    
    public void establecerCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionMac(String dm) {
        direccionMac = dm;
    }
    
    public void establecerInformacionImei(long imei) {
        informacionImei = imei;
    }
    
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public String obtenerTamanioPantalla() {
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaEnPorcentaje() {
        return ivaEnPorcentaje;
    }
    
    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    
    public long obtenerInformacionImei() {
        return informacionImei;
    }
    }
    

