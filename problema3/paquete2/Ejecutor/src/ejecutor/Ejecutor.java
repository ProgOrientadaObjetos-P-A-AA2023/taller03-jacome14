
package ejecutor;

import paquete1.EntidadAdministrativa;

public class Ejecutor {

    
   public static void main(String[] args) {
        EntidadAdministrativa entidad = new EntidadAdministrativa();

        String nombre = "La Salle";
        String tipoDeInstitucion = "Particular";
        int numeroDeEstudiantes = 1540;
        int numeroDeDocentes = 40;
        int numeroDeSedes = 1;
        double gastosProyectadoPorEstudiante = 45;

        enti.establecerNombre(nombre);
        enti.establecerTipoDeInstitucion(tipoDeInstitucion);
        enti.establecerNumeroDeEstudiantes(numeroDeEstudiantes);
        enti.establecerNumeroDeDocentes(numeroDeDocentes);
        enti.establecerNumeroDeSedes(numeroDeSedes);
        enti.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante);
        enti.establecerPresupuesto();

        //Se presenta los Datos
        System.out.printf("Institución Educativa 1\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n", entidad.obtenerNombre(),
                entidad.obtenerTipoDeInstitucion(), entidad.obtenerNumeroDeEstudiantes(), entidad.obtenerNumeroDeDocentes(),
                entidad.obtenerNumeroDeSedes(), entidad.obtenerGastosProyectadoPorEstudiante(), entidad.obtenerPresupuesto());
        
        System.out.println("----------------------------------------");
        
        EntidadAdministrativa entidad2 = new EntidadAdministrativa();

        String nombre2 = "Eugenio Espejo";
        String tipoDeInstitucion2 = "Particular";
        int numeroDeEstudiantes2 = 2300;
        int numeroDeDocentes2 = 50;
        int numeroDeSedes2 = 1;
        double gastosProyectadoPorEstudiante2 = 156.50;

        entidad2.establecerNombre(nombre2);
        entidad2.establecerTipoDeInstitucion(tipoDeInstitucion2);
        entidad2.establecerNumeroDeEstudiantes(numeroDeEstudiantes2);
        entidad2.establecerNumeroDeDocentes(numeroDeDocentes2);
        entidad2.establecerNumeroDeSedes(numeroDeSedes2);
        entidad2.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante2);
        entidad2.establecerPresupuesto();

        //Se presenta los Datos
        System.out.printf("\n\tInstitución Educativa 2\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n", entidad2.obtenerNombre(),
                entidad2.obtenerTipoDeInstitucion(), entidad2.obtenerNumeroDeEstudiantes(), entidad2.obtenerNumeroDeDocentes(),
                entidad2.obtenerNumeroDeSedes(), entidad2.obtenerGastosProyectadoPorEstudiante(), entidad2.obtenerPresupuesto());

    }
}
