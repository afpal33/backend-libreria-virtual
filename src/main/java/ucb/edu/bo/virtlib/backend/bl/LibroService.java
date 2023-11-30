package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import ucb.edu.bo.virtlib.backend.repository.LibroRepository;

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
}
