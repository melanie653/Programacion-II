
import java.io.Serializable;

class Pagina implements Serializable{
    private int numero;
    private String contenido;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    public void mostrarPagina() {
        System.out.println("Página " + numero + ": " + contenido);
    }
}