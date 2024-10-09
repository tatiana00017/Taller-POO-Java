package Ejercicio2;

public class Triangulo {
double base;
double altura;


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (getAltura()*getBase())/2;

    }

    @Override
    public double calcularPerimetro() {

    return 0;
    }
}
