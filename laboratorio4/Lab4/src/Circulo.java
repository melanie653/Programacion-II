class Circulo extends Figura {
    private double radio;
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Círculo: Radio= " + radio + ", Color= " + color +
               ", Área= " + area() + ", Perímetro= " + perimetro();
    }
}
