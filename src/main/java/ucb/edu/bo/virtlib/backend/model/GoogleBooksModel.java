package ucb.edu.bo.virtlib.backend.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "google_books")
public class GoogleBooksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long google_libro_id;
    private String libro;
    private String autor;
    private String genero;
    private String preview;
    private Double precio;
    private Date fecha_lanzamiento;
    private String imagen;

    public GoogleBooksModel(Long google_libro_id, String libro, String autor, String genero, String preview, Double precio, Date fecha_lanzamiento, String imagen) {
        this.google_libro_id = google_libro_id;
        this.libro = libro;
        this.autor = autor;
        this.genero = genero;
        this.preview = preview;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.imagen = imagen;
    }

    public Long getGoogle_libro_id() {
        return google_libro_id;
    }

    public void setGoogle_libro_id(Long google_libro_id) {
        this.google_libro_id = google_libro_id;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
