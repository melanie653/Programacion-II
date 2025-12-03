import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BibliotecaGUI extends JFrame {
    private Biblioteca biblioteca;

    public BibliotecaGUI() {
        biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes a Viernes", "08:00", "18:00");

        setTitle("Biblioteca UMSA");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton btnAgregarAutor = new JButton("Agregar Autor");
        JButton btnAgregarLibro = new JButton("Agregar Libro");
        JButton btnPrestarLibro = new JButton("Prestar Libro");
        JButton btnMostrarEstado = new JButton("Mostrar Estado");
        JButton btnGuardarDatos = new JButton("Guardar Datos");

        panel.add(btnAgregarAutor);
        panel.add(btnAgregarLibro);
        panel.add(btnPrestarLibro);
        panel.add(btnMostrarEstado);
        panel.add(btnGuardarDatos);

        add(panel);

        // Listeners de botones
        btnAgregarAutor.addActionListener(e -> agregarAutor());
        btnAgregarLibro.addActionListener(e -> agregarLibro());
        btnPrestarLibro.addActionListener(e -> prestarLibro());
        btnMostrarEstado.addActionListener(e -> mostrarEstadoVentana());
        btnGuardarDatos.addActionListener(e -> biblioteca.guardarDatos());
    }

    private void agregarAutor() {
        String nombre = JOptionPane.showInputDialog(this, "Nombre del autor:");
        String nacionalidad = JOptionPane.showInputDialog(this, "Nacionalidad:");
        if (nombre != null && nacionalidad != null) {
            biblioteca.agregarAutor(new Autor(nombre, nacionalidad));
            JOptionPane.showMessageDialog(this, "Autor agregado correctamente.");
        }
    }

    private void agregarLibro() {
        String titulo = JOptionPane.showInputDialog(this, "Título del libro:");
        String isbn = JOptionPane.showInputDialog(this, "ISBN:");
        String contenido = JOptionPane.showInputDialog(this, "Contenido de la primera página:");
        if (titulo != null && isbn != null && contenido != null) {
            java.util.List<String> paginas = new java.util.ArrayList<>();
            paginas.add(contenido);
            biblioteca.agregarLibro(new Libro(titulo, isbn, paginas));
            JOptionPane.showMessageDialog(this, "Libro agregado correctamente.");
        }
    }

    private void prestarLibro() {
        String nombreEst = JOptionPane.showInputDialog(this, "Nombre del estudiante:");
        String codigo = JOptionPane.showInputDialog(this, "Código del estudiante:");
        if (nombreEst != null && codigo != null) {
            if (biblioteca.getLibros().size() == 0) {
                JOptionPane.showMessageDialog(this, "No hay libros disponibles.");
                return;
            }
            Object[] librosArray = biblioteca.getLibros().stream().map(Libro::getTitulo).toArray();
            String libroSeleccionado = (String) JOptionPane.showInputDialog(this, "Seleccione libro:",
                    "Libros", JOptionPane.QUESTION_MESSAGE, null, librosArray, librosArray[0]);
            if (libroSeleccionado != null) {
                Libro libro = biblioteca.getLibros().stream()
                        .filter(l -> l.getTitulo().equals(libroSeleccionado))
                        .findFirst().orElse(null);
                if (libro != null) {
                    biblioteca.prestarLibro(new Estudiante(codigo, nombreEst), libro);
                    JOptionPane.showMessageDialog(this, "Préstamo realizado.");
                }
            }
        }
    }

    private void mostrarEstadoVentana() {
        JFrame estadoFrame = new JFrame("Estado de la Biblioteca");
        estadoFrame.setSize(500, 400);
        estadoFrame.setLocationRelativeTo(this);

        JTextArea texto = new JTextArea();
        texto.setEditable(false);

        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca: ").append(biblioteca.getNombre()).append("\n");
        sb.append("Horario: ");
        sb.append(biblioteca.getHorario().getDias()).append(" de ");
        sb.append(biblioteca.getHorario().getHoraApertura()).append(" a ");
        sb.append(biblioteca.getHorario().getHoraCierre()).append("\n\n");

        sb.append("Autores:\n");
        for (Autor a : biblioteca.getAutores()) {
            sb.append("- ").append(a.getNombre()).append(" (").append(a.getNacionalidad()).append(")\n");
        }
        sb.append("\nLibros:\n");
        for (Libro l : biblioteca.getLibros()) {
            sb.append("- ").append(l.getTitulo()).append("\n");
        }
        sb.append("\nPréstamos:\n");
        for (Prestamo p : biblioteca.getPrestamos()) {
            sb.append("- ").append(p.getLibro().getTitulo())
              .append(" -> ").append(p.getEstudiante().getNombre()).append("\n");
        }

        texto.setText(sb.toString());

        estadoFrame.add(new JScrollPane(texto));
        estadoFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BibliotecaGUI().setVisible(true);
        });
    }
}
