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

    public Optional<LibreriaModel> getLibroEnLibreriaById(Long libreriaId) {
        return libreriaRepository.findById(libreriaId);
    }

    public void borrarLibroEnLibreriaById(Long libreriaId) {
        libreriaRepository.deleteById(libreriaId);
    }

    public LibreriaModel agregarLibroALibreria(Long usuarioId, Long libroPrecioId) {
        LibreriaModel nuevaEntrada = new LibreriaModel(null, usuarioId, libroPrecioId);
        return libreriaRepository.save(nuevaEntrada);
    }
}
