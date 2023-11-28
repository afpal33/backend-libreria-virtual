package ucb.edu.bo.virtlib.backend.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.util.function.LongFunction;

@Entity
@Table(name = "libro_precio")
public class LibroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libro_id;

    private Long rating_rating_id;

    private Long google_books_google_libro_id;

    private Long amazon_amazon_item_id;

    public LibroModel(Long libro_id, Long rating_rating_id, Long google_books_google_libro_id, Long amazon_amazon_item_id) {
        this.libro_id = libro_id;
        this.rating_rating_id = rating_rating_id;
        this.google_books_google_libro_id = google_books_google_libro_id;
        this.amazon_amazon_item_id = amazon_amazon_item_id;
    }

    public Long getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(Long libro_id) {
        this.libro_id = libro_id;
    }

    public Long getRating_rating_id() {
        return rating_rating_id;
    }

    public void setRating_rating_id(Long rating_rating_id) {
        this.rating_rating_id = rating_rating_id;
    }

    public Long getGoogle_books_google_libro_id() {
        return google_books_google_libro_id;
    }

    public void setGoogle_books_google_libro_id(Long google_books_google_libro_id) {
        this.google_books_google_libro_id = google_books_google_libro_id;
    }

    public Long getAmazon_amazon_item_id() {
        return amazon_amazon_item_id;
    }

    public void setAmazon_amazon_item_id(Long amazon_amazon_item_id) {
        this.amazon_amazon_item_id = amazon_amazon_item_id;
    }
}
