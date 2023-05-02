
package entidadadministrativa;

public class EntidadAdministrativa {
    private String nombre;
    private String tipoDeInstitucion;
    private int numeroDeEstudiantes;
    private int numeroDeDocentes;
    private int numeroDeSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerTipoDeInstitucion(String t){
        tipoDeInstitucion = t;
    }
    
    public void establecerNumeroDeEstudiantes(int e){
        numeroDeEstudiantes = e;
    }
    
    public void establecerNumeroDeDocentes(int d){
        numeroDeDocentes = d;
    }
    
    public void establecerNumeroDeSedes(int se){
        numeroDeSedes = se;
    }
    
    public void establecerGastosProyectadoPorEstudiante(double gasto){
        gastosProyectadoPorEstudiante = gasto;
    }
    
    public void establecerPresupuesto(){
        presupuesto = numeroDeEstudiantes * gastosProyectadoPorEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoDeInstitucion(){
        return tipoDeInstitucion;
    }
    
    public int obtenerNumeroDeEstudiantes(){
        return numeroDeEstudiantes;
    }
    
    public int obtenerNumeroDeDocentes(){
        return numeroDeDocentes;
    }
    
    public int obtenerNumeroDeSedes(){
        return numeroDeSedes;
    }
    
    public double obtenerGastosProyectadoPorEstudiante(){
        return gastosProyectadoPorEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
