package ucb.edu.bo.virtlib.backend.model;

import jakarta.persistence.*;

import java.io.Serial;

@Entity
@Table(name="libreria")
public class LibreriaModel {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long libreria_id;

    private Long usuario_user_id;

    private Long libro_precio_libro_id;

    public LibreriaModel(Long libreria_id, Long usuario_user_id, Long libro_precio_libro_id) {
        this.libreria_id = libreria_id;
        this.usuario_user_id = usuario_user_id;
        this.libro_precio_libro_id = libro_precio_libro_id;
    }

    public Long getLibreria_id() {
        return libreria_id;
    }

    public void setLibreria_id(Long libreria_id) {
        this.libreria_id = libreria_id;
    }

    public Long getUsuario_user_id() {
        return usuario_user_id;
    }

    public void setUsuario_user_id(Long usuario_user_id) {
        this.usuario_user_id = usuario_user_id;
    }

    public Long getLibro_precio_libro_id() {
        return libro_precio_libro_id;
    }

    public void setLibro_precio_libro_id(Long libro_precio_libro_id) {
        this.libro_precio_libro_id = libro_precio_libro_id;
    }
}
