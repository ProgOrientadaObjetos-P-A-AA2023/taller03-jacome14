
package terreno;


public class Terreno {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerCostoTerreno(){
        costoTerreno = area * valorMetroCuadrado;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerArea(){
        area = ancho * largo;
    }
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public double obtenerCostoTerreno(){
        return costoTerreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
}
