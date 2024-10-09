package Ejercicio2;

public class Rectangulo extends Figura{
    double base;
    double altura;

    public Rectangulo(double base, double altura, double v, double v1) {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, Double posicionX, Double posicionY, double base, double altura) {
        super(color, posicionX, posicionY);
        this.base = base;
        this.altura = altura;
    }

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
