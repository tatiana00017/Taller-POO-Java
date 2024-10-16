package Ejercicio2;

public abstract class Figura {
    public String color;
   public  double posicionX, posicionY;
    abstract double calcularArea();
    abstract double calcularPerimetro();

    public Figura() {
    }

    public Figura(String color, Double posicionX, Double posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(Double posicionX) {
        this.posicionX = posicionX;
    }

    public Double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(Double posicionY) {
        this.posicionY = posicionY;
    }
}
