package Ejercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuFigura {
    Scanner sc = new Scanner(System.in);
    int optMenu;
    boolean sistemaActivado = true;

  public void menu(){


      do {
          System.out.println("\t\t1. Crear una nueva figura (círculo, rectángulo o triángulo)");
          System.out.println("\t\t2. Calcular el área y perímetro de una figura.");
          System.out.println("\t\t3. Mover una figura.");
          System.out.println("\t\t4. Dibujar una figura.");
          System.out.println("\t\t5. Salir del programa.");
          System.out.println("Opción: ");



      }while(sistemaActivado);
  }




}
