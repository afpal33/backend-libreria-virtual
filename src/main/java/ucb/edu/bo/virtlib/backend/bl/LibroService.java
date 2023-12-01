package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucb.edu.bo.virtlib.backend.model.LibroModel;
import ucb.edu.bo.virtlib.backend.repository.LibroRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<LibroModel> getAllLibrosPrecios() {
        return libroRepository.findAll();
    }

    public Optional<LibroModel> getLibroPrecioById(Long libroPrecioId) {
        return libroRepository.findById(libroPrecioId);
    }

    public void borrarLibroPrecioById(Long libroPrecioId) {
        libroRepository.deleteById(libroPrecioId);
    }
    public LibroModel crearLibro(Map<String, String> body) {
        Long ratingRatingId = Long.parseLong(body.get("rating_rating_id"));
        Long googleBooksGoogleLibroId = Long.parseLong(body.get("google_books_google_libro_id"));
        Long amazonAmazonItemId = Long.parseLong(body.get("amazon_amazon_item_id"));

        // Asumiendo que el constructor correcto para LibroModel es con cuatro parámetros
        LibroModel nuevoLibro = new LibroModel(null, ratingRatingId, googleBooksGoogleLibroId, amazonAmazonItemId);
        libroRepository.save(nuevoLibro);

        return nuevoLibro;
    }

}
