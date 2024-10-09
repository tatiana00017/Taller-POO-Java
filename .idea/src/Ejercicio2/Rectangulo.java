package Ejercicio2;

public class Rectangulo {
    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return getAltura()*getBase();

    }

    @Override
    public double calcularPerimetro() {

        return 2*getAltura()+2*getBase();

    }
}
