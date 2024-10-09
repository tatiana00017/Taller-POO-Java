package Ejercicio2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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
                        double radio = sc.nextInt();
                        crearCirculo(radio);
                        System.out.println( "exitooo");
                        break;
                    }
                    if (optMenu == 2) {
                        System.out.println("Escriba la base del rectangulo: ");
                        double base = sc.nextInt();
                        System.out.println("Escriba la base del rectangulo: ");
                        double altura = sc.nextInt();

                        crearRectangulo(base,altura);

                        System.out.println( "exitooo");
                        break;
                    }
                    if (optMenu == 3) {
                        System.out.println("Escriba la base del Triangulo: ");
                        double base = sc.nextInt();
                        System.out.println("Escriba la base del Triangulo: ");
                        double altura = sc.nextInt();

                        crearTriangulo(base,altura);

                        System.out.println( "exitooo");
                        break;
                    }

                    break;
                case 2:
                  if(!listaFiguras.isEmpty()){
                      System.out.println("De la siguiente lista, elija la figura que quiere mover: ");
                      IntStream.range(0, listaFiguras.size()).forEach(n -> System.out.println((n+1)+". " +lis));
                  }




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


    public void crearCirculo(double radio) {
        Figura circulo;
        
        listaFiguras.add(circulo);
        System.out.println("Se ha credo un Circulo!");
    }

    public void crearRectangulo(double base, double altura) {
        Figura rectangulo;
        listaFiguras.add(rectangulo);
        System.out.println("Se ha credo un Rectangulo!");
    }


    public void crearTriangulo(double base, double altura) {
        Figura triangulo;
        listaFiguras.add(triangulo);

        System.out.println("Se ha credo un Triangulo!");
    }


}
