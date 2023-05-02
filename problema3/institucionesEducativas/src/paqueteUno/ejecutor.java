/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteUno;

import paquetoDos.administrar_Instituciones;

/**
 *
 * @author PERSONAL
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        administrar_Instituciones ft = new administrar_Instituciones(); 
         administrar_Instituciones ft2 = new administrar_Instituciones(); 
       
       
        // Valores de entrada
        String nombre = "Bernardo";
       String tipo = "Primaria";
       int  alumnos= 40;
       int docentes=5;
       int sedes=10;
       double gastoEstudiantes =110.20;
        ft.establecerNombre(nombre);
        ft.establecerTipoInstitucion(tipo);
        ft.establecerAlumnos(alumnos);
        ft.establecerSedes(sedes);
        ft.establecerDocentes(docentes);
        ft.establecerGasto(gastoEstudiantes);
        ft.establecerPresupuesto();
        
       String nombre1 = "Juan Montalvo";
       String tipo1 = "Secundaria";
       int  alumnos1= 110;
       int docentes1=15;
       int sedes1=3;
       double gastoEstudiantes1 =130.20;
        ft2.establecerNombre(nombre1);
        ft2.establecerTipoInstitucion(tipo1);
        ft2.establecerAlumnos(alumnos1);
        ft2.establecerSedes(sedes1);
        ft2.establecerDocentes(docentes1);
        ft2.establecerGasto(gastoEstudiantes1);
        ft2.establecerPresupuesto();
        
       
        
       
         System.out.println("-------------------------");
        System.out.println("Administracion Institucion Educativa (objeto 1) ");
        System.out.printf("Nombre Institucion: %s\n"
                + "Tipo de Institucion: %s\n"
                + "Numero de alumnos:%d\n"
                + "Numero de docentes: %d\n"
                + "Sedes: %d\n"
                + "Gastos: %.2f\n"
                + "Presupuesto: %.2f\n", ft.obtenerNombre(),
                ft.obtenerTipo(), ft.obtenerAlumnons(),ft.obtenerDocentes(),
                ft.obtenerSedes(),ft.obtenerGasto(),ft.obtenerPresupuesto());
        
        
        
        System.out.println("-------------------------");
        System.out.println("Administracion Institucion Educativa (objeto 2) ");
        System.out.printf("Nombre Institucion: %s\n"
                + "Tipo de Institucion: %s\n"
                + "Numero de alumnos:%d\n"
                + "Numero de docentes: %d\n"
                + "Sedes: %d\n"
                + "Gastos: %.2f\n"
                + "Presupuesto: %.2f\n", ft2.obtenerNombre(),
                ft2.obtenerTipo(), ft2.obtenerAlumnons(),ft2.obtenerDocentes(),
                ft2.obtenerSedes(),ft2.obtenerGasto(),ft2.obtenerPresupuesto());
        
        
    }  
}
    
    

