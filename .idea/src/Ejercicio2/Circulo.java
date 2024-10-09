package Ejercicio2;

public class Circulo extends Figura{

    double radio;

    public Circulo(double radio, double v, double v1) {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(String color, Double posicionX, Double posicionY, double radio) {
        super(color, posicionX, posicionY);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

@Override
    public double calcularArea() {
    double pi = 3.14;
    double areaCirculo = pi*(getRadio()*getRadio());
        return areaCirculo;

    }

@Override
    public double calcularPerimetro() {
        double pi = 3.14;

        return 2*pi*getRadio();

    }
}
