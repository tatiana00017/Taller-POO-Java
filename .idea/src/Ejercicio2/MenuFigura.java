package Ejercicio2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFigura {
    Scanner sc = new Scanner(System.in);
    List<Figura> listaFiguras = new ArrayList<>();
    int optMenu;
    boolean sistemaActivado = true;

    public void menu() {

        do {
            System.out.println("\t\t1. Crear una nueva figura (círculo, rectángulo o triángulo)");
            System.out.println("\t\t2. Calcular el área y perímetro de una figura.");
            System.out.println("\t\t3. Mover una figura.");
            System.out.println("\t\t4. Dibujar una figura.");
            System.out.println("\t\t5. Salir del programa.");
            System.out.println("Opción: ");
            optMenu = sc.nextInt();
            System.out.println();
            switch (optMenu) {
                case 1:
                    System.out.println("¿Que deseas crear?");
                    System.out.println("\t\t1. Círculo.");
                    System.out.println("\t\t2. Rectangulo.");
                    System.out.println("\t\t3. Triangulo.");
                    optMenu = sc.nextInt();
                    if (optMenu == 1) {
                        System.out.println("Escriba el radio del circulo:");
                        int radio = sc.nextInt();
                        crearCirculo(radio);
                        System.out.println( "exitooo");
                        break;
                    }
                    if (optMenu == 2) {
                        System.out.println("Escriba la base del rectangulo: ");
                        int base = sc.nextInt();
                        System.out.println("Escriba la base del rectangulo: ");
                        int altura = sc.nextInt();

                        crearRectangulo(base,altura);

                        System.out.println( "exitooo");
                        break;
                    }
                    if (optMenu == 3) {
                        System.out.println("Escriba la base del Triangulo: ");
                        int base = sc.nextInt();
                        System.out.println("Escriba la base del Triangulo: ");
                        int altura = sc.nextInt();

                        crearTriangulo(base,altura);

                        System.out.println( "exitooo");
                        break;
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Haz cerrado el sistema!");
                    sistemaActivado = false;
                    break;
                default:
                    System.out.println("Opción incorrecta! Vuelves al menu principal.");
                    break;

            }
        } while (sistemaActivado);
    }


    public void crearCirculo(int radio) {
        Figura circulo;
        
        listaFiguras.add(circulo);
        System.out.println("Este es tu dato " + radio);
    }

    public void crearRectangulo(int base, int altura) {
        Figura rectangulo;
    }


    public void crearTriangulo(int base, int altura) {
        Figura triangulo;
    }


}
