package Ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Escuela {

    private Set<Estudiante> estudiantes;

    public Escuela() {
        estudiantes = new HashSet<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void buscarEstudiante(String estudiante) {
        for (Estudiante estudiante1 : estudiantes) {
            if ((estudiante1.getNombre()).equals(estudiante)) {
                System.out.println("Estudiante : " + estudiante1.getNombre() + " encontrado");
            } else {
                System.out.println("Estudiante : " + estudiante1.getNombre() + " no encontrado");

            }
        }
    }

    public void verEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Estudiante : " + estudiante.getNombre() + " Id: " + estudiante.getId() + " Calificacion: " + estudiante.getCalificacion());
        }
    }

    public void modificarEstudiante(String estudiante) {
        Scanner sc = new Scanner(System.in);
        for (Estudiante estudiante1 : estudiantes) {
            if ((estudiante1.getNombre()).equals(estudiante)) {
                System.out.println("Ingrese nuevo nombre: ");
                String nombreNuevo = sc.next();
                System.out.println("Ingrese nuevo id");
                int idNuevo = sc.nextInt();
                double calificacionNuevo;
                do{
                    System.out.println("Ingrese nueva calificacion: ");
                    calificacionNuevo = sc.nextDouble();
                }while(calificacionNuevo<=10 || calificacionNuevo>=0);

                estudiante1.setNombre(nombreNuevo);
                estudiante1.setId(idNuevo);
                estudiante1.setCalificacion(calificacionNuevo);
            } else {
                System.out.println("Estudiante : " + estudiante1.getNombre() + " no encontrado");
            }
        }
    }

    public void eliminarEstudiante(String estudiante) {
        Scanner sc = new Scanner(System.in);
        for (Estudiante estudiante1 : estudiantes) {
            if ((estudiante1.getNombre()).equals(estudiante)) {
                estudiantes.remove(estudiante1);
                System.out.println("Se elimino estudiante satisfactoriamente");
            } else {
                System.out.println("Estudiante no encontrado");
            }
        }
    }
}
