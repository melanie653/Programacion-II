public class Main2 {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, -1, 2);
        System.out.println("a = ");
        a.imprimir();
        System.out.println("b = "); 
        b.imprimir();
        Vector3D suma = Vector3D.operar(a, b);
        System.out.print("a + b = "); 
        suma.imprimir();
        Vector3D escalar = Vector3D.operar(2, a);
        System.out.print("2 * a = "); 
        escalar.imprimir();
        System.out.println("|a| = " + Vector3D.operar(a));
        System.out.print("Normal de a = "); 
        Vector3D.normal(a).imprimir();
        System.out.println("a · b = " + Vector3D.operar(a, b, 1));
        Vector3D cruz = Vector3D.operar(a, b, "cruz");
        System.out.print("a × b = "); 
        cruz.imprimir();
    }
}