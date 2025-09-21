public class Main1 {
    public static void main(String[] args) {
        Vector a = new Vector(2, 3, 0);
        Vector b = new Vector(-3, 2, 0);
        AlgebraVectorial alg = new AlgebraVectorial();
        System.out.println("a = "); 
        a.imprimir();
        System.out.println("b = "); 
        b.imprimir();
        System.out.println("|a+b|=|a-b| " + alg.Perpendicular(a, b));
        System.out.println("|a-b|=|b-a| " + alg.Perpendicular(a, b, "mutuo"));
        System.out.println("a·b=0" + alg.Perpendicular(a, b, 1));
        System.out.println("|a+b|^2=|a|^2+|b|^2 " + alg.Perpendicular(a, b, 1.0));
        System.out.println("a∥b (def 1) " + alg.Paralela(a, b));
        System.out.println("a∥b (def 2) " + alg.Paralela(a, b, 1));
        Vector proy = alg.proyeccion(a, b);
        System.out.print("Proy_a(b) = "); proy.imprimir();
        System.out.println("Comp_a(b) = " + alg.componente(a, b));
    }
    
}