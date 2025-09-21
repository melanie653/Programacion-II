class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(double x, double y, double z) {
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
    public static Vector3D operar(Vector3D a, Vector3D b) {
        return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public static Vector3D operar(double r, Vector3D a) {
        return new Vector3D(r*a.x, r*a.y, r*a.z);
    }
    public static double operar(Vector3D a) {
        return Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
    }
    public static Vector3D normal(Vector3D a) {
        double mod = operar(a);
        if (mod == 0) throw new ArithmeticException("Vector nulo no tiene normal.");
        return new Vector3D(a.x/mod, a.y/mod, a.z/mod);
    }
    public static double operar(Vector3D a, Vector3D b, int metodo) {
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }
    public static Vector3D operar(Vector3D a, Vector3D b, String metodo) {
        return new Vector3D(
            a.y*b.z - a.z*b.y,
            a.z*b.x - a.x*b.z,
            a.x*b.y - a.y*b.x
        );
    }
    public void imprimir() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}