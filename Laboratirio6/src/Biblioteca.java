import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.*;
class Biblioteca implements Serializable {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
        cargarDatos(); 
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo p = new Prestamo(estudiante, libro);
        prestamos.add(p);
        System.out.println("Se ha realizado un préstamo exitosamente.");
    }

    public void mostrarEstado() {
        System.out.println("ESTADO DE LA BIBLIOTECA " + nombre );
        horario.mostrarHorario();
        System.out.println("Autores registrados:");
        for (Autor a : autores) a.mostrarInfo();
        System.out.println("Libros disponibles:");
        for (Libro l : libros) System.out.println("- " + l.getTitulo());
        System.out.println("Préstamos activos:");
        for (Prestamo p : prestamos) p.mostrarInfo();
    }

    public void cerrarBiblioteca() {
        System.out.println("La biblioteca " + nombre + " ha cerrado. Todos los préstamos fueron eliminados.");
        prestamos.clear();
    }
    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"))) {
            oos.writeObject(libros);
            oos.writeObject(autores);
            oos.writeObject(prestamos);
            System.out.println("Datos guardados correctamente.");
    } catch (Exception e) {
        System.out.println("Error al guardar: " + e.getMessage());
    }
    }
    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.dat"))) {
            libros = (List<Libro>) ois.readObject();
            autores = (List<Autor>) ois.readObject();
            prestamos = (List<Prestamo>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
    } catch (Exception e) {
        System.out.println("No se pudieron cargar datos previos: " + e.getMessage());
    }
}


}