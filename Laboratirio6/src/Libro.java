import java.io.Serializable;
import java.util.*;
class Libro implements Serializable{
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }
    
    public Libro(String titulo, String isbn, List<String> contenidosPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        for (int i = 0; i < contenidosPaginas.size(); i++) {
            this.paginas.add(new Pagina(i + 1, contenidosPaginas.get(i)));
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void leer() {
        System.out.println("Leyendo " + titulo + ":");
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
}