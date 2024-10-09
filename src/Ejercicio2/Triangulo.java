package Ejercicio2;

public class Triangulo extends Figura{
double base;
double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String color, Double posicionX, Double posicionY, double base, double altura) {
        super(color, posicionX, posicionY);
        this.base = base;
        this.altura = altura;
    }

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
        double hipotenusa = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));

        double perimetro = base + altura + hipotenusa;
    return perimetro;
    }
}
