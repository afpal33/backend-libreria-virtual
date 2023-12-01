package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucb.edu.bo.virtlib.backend.model.LibreriaModel;
import ucb.edu.bo.virtlib.backend.repository.LibreriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LibreriaService {
    @Autowired
    private LibreriaRepository libreriaRepository;

    public List<LibreriaModel> getAllLibrosEnLibreria() {
        return libreriaRepository.findAll();
    }

    public Optional<LibreriaModel> getLibroEnLibreriaById(Long libroId) {
        return libreriaRepository.findById(libroId);
    }

    public void borrarLibroEnLibreriaById(Long libroId) {
        libreriaRepository.deleteById(libroId);
    }
}
