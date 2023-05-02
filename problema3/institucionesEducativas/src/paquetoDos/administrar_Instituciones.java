/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetoDos;

/**
 *
 * @author PERSONAL
 */
public class administrar_Instituciones {
    private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastoEstudiantes;
    private double presupuesto;
    
    
    public void establecerNombre(String c){
        nombre = c;
    }
     public void establecerTipoInstitucion(String c){
        tipo = c;
    }
    
    public void establecerAlumnos(int c){
        alumnos = c;
    }
    public void establecerDocentes(int c){
        docentes = c;
    }
    
    public void establecerSedes(int c){
        sedes = c;
    }
     public void establecerGasto(double c){
        gastoEstudiantes = c;
    }
    public void establecerPresupuesto(){
        presupuesto = alumnos * gastoEstudiantes;
    }
    
    
    
    
    public String obtenerNombre(){
        return  nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerAlumnons(){
        return alumnos;
    }
      public int obtenerDocentes(){
        return docentes;
    }
        public int obtenerSedes(){
        return sedes;
    }
     public double obtenerGasto(){
        return gastoEstudiantes;
       
    }
     public double obtenerPresupuesto(){
        return presupuesto;
       
    }
    
}
