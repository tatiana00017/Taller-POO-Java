package Ejercicio2;

class Circulo {

    double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

@Override
    public double calcularArea() {
    double pi = 3.14;
    double areaCirculo = pi*(Math.pow(getRadio(),2);
        return areaCirculo;

    }

@Override
    public double calcularPerimetro() {
        double pi = 3.14;

        return 2*pi*getRadio();

    }
}
