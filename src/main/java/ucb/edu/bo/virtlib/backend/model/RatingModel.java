package ucb.edu.bo.virtlib.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rating")
public class RatingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rating_id;

    private Integer calificacion;
    private String comentario;
    private Long usuario_user_id;

    public RatingModel(Long rating_id, Integer calificacion, String comentario, Long usuario_user_id) {
        this.rating_id = rating_id;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.usuario_user_id = usuario_user_id;
    }

    public Long getRating_id() {
        return rating_id;
    }

    public void setRating_id(Long rating_id) {
        this.rating_id = rating_id;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getUsuario_user_id() {
        return usuario_user_id;
    }

    public void setUsuario_user_id(Long usuario_user_id) {
        this.usuario_user_id = usuario_user_id;
    }
}
