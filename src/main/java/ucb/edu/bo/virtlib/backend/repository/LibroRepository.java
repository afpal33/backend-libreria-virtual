package ucb.edu.bo.virtlib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucb.edu.bo.virtlib.backend.model.LibroModel;

public interface LibroRepository extends JpaRepository<LibroModel, Long> {
}
