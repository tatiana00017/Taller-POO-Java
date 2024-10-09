package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escuela escuela = new Escuela();

        int opcion;
        do {
            System.out.println("Ingrese la opcion que desea: \n" +
                    "1. Agregar estudiante \n" +
                    "2. Buscar estudiante \n" +
                    "3. Ver estudiantes \n" +
                    "4. Modificar estudiante \n" +
                    "5. Eliminar estudiante \n" +
                    "0. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Saliendo ...");
                    break;
                case 1:
                    System.out.println("Ingrese nombre del estudiante: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese codigo del estudiante: ");
                    int codigo = sc.nextInt();
                    double calificacion;
                    do{
                        System.out.println("Ingrese calificacion del estudiante: ");
                        calificacion = sc.nextDouble();
                    }while(calificacion<=10 || calificacion>=0);


                    Estudiante estudiante = new Estudiante(nombre,codigo,calificacion);
                    escuela.agregarEstudiante(estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del estudiante: ");
                    String buscar = sc.next();
                    escuela.buscarEstudiante(buscar);
                    break;
                case 3:
                    escuela.verEstudiantes();
                    break;
                case 4:
                    System.out.println("Ingrese nombre que desea modificar: ");
                    String buscar1 = sc.next();
                    escuela.modificarEstudiante(buscar1);
                    break;
                case 5:
                    System.out.println("Ingrese nombre que desea eliminar : ");
                    String buscar2 = sc.next();
                    escuela.eliminarEstudiante(buscar2);
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }while(opcion!=0);


    }
}
