package examen;


public class main {
	
	    public static void main(String[] args) {
	        MiTeleferico mt = new MiTeleferico();
	        mt.agregarLinea("Roja");
	        mt.agregarCabina("Roja");
	        mt.agregarCabina("Roja");
	        Persona p1 = new Persona("Ana", 20, 60f);
	        Persona p2 = new Persona("Luis", 30, 70f);
	        mt.lineas[0].agregarPersona(p1);
	        mt.lineas[0].agregarPersona(p2);
	        mt.lineas[0].cabinas[0].agregarPersona(p1);
	        mt.lineas[0].cabinas[0].agregarPersona(p2);
	        System.out.println("¿Cabinas correctas?: " + mt.lineas[0].verificarCabinas());

	        
	        System.out.println("Ingreso total línea Roja: " + mt.lineas[0].ingresoLinea());

	      
	        System.out.println("Ingreso total MiTeleferico: " + mt.calcularIngresoTotal());
	      System.out.println("Ingreso tarifa regular: " + mt.lineas[0].ingresoRegular());
	    }