class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x; }
    public double getY() { 
        return y; }
    public double getZ() { 
        return z; }

    public double modulo() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double productoPunto(Vector b) {
        return x*b.x + y*b.y + z*b.z;
    }

    public Vector productoCruz(Vector b) {
        return new Vector(
            y*b.z - z*b.y,
            z*b.x - x*b.z,
            x*b.y - y*b.x
        );
    }

    public Vector escalar(double r) {
        return new Vector(r*x, r*y, r*z);
    }

    public Vector suma(Vector b) {
        return new Vector(x + b.x, y + b.y, z + b.z);
    }

    public Vector resta(Vector b) {
        return new Vector(x - b.x, y - b.y, z - b.z);
    }

    public void imprimir() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}