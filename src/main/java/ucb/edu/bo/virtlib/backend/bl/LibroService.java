package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucb.edu.bo.virtlib.backend.model.LibroModel;
import ucb.edu.bo.virtlib.backend.repository.LibroRepository;

import java.util.List;
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
}
