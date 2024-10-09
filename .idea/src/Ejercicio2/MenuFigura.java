package Ejercicio2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MenuFigura {
    Scanner sc = new Scanner(System.in);
    Scanner scTring = new Scanner(System.in);
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
                        System.out.println("Escriba el color del circulo:");
                        String color  = scTring.nextLine();
                        System.out.println("Escriba el radio del circulo:");
                        double radio = sc.nextInt();
                        Figura circulo = new Circulo(color, 1.0, 8.0, radio);
                        boolean add = listaFiguras.add(circulo);
                        System.out.println( "Se ha creado el circulo!");
                        break;
                    }
                    if (optMenu == 2) {
                        System.out.println("Escriba el color del Rectangulo:");
                        String color  = scTring.nextLine();
                        System.out.println("Escriba la base del Rectangulo:");
                        double b = sc.nextDouble();
                        System.out.println("Escriba la altura del Rectangulo:");
                        double a = sc.nextDouble();
                        Figura rec = new Rectangulo(color, 1.0, 8.0, b, a);
                        boolean add = listaFiguras.add(rec);
                        System.out.println( "Se ha creado el Rectangulo!");
                        break;
                    }
                    if (optMenu == 3) {
                        System.out.println("Escriba el color del Triangulo:");
                        String color  = scTring.nextLine();
                        System.out.println("Escriba la base del Triangulo:");
                        double b = sc.nextDouble();
                        System.out.println("Escriba la altura del Triangulo:");
                        double a = sc.nextDouble();
                        Figura tria = new Triangulo(color, 1.0, 8.0, b, a);
                        boolean add = listaFiguras.add(tria);
                        System.out.println( "Se ha creado el Triangulo!");
                        break;
                    }

                    break;
                case 2:
                  if(!listaFiguras.isEmpty()){
                      System.out.println("De la siguiente lista, elija la figura que quiere mover: ");
                      for (int i = 0; i < listaFiguras.size(); i++){
                          System.out.println((1+i) +" "+ listaFiguras.get(i) );
                      }
                      System.out.println("Opcion: ");
                      int cl = sc.nextInt();
                      Figura fig = listaFiguras.get(cl-1);
                      System.out.println("La posicion x hacia donde mover: ");
                      double p = sc.nextDouble();
                      fig
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









}
