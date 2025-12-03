
import java.io.Serializable;

class Estudiante implements Serializable{
    private String codigo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " (Código: " + codigo + ")");
    }
    public String getNombre() {
        return nombre;
    }
}