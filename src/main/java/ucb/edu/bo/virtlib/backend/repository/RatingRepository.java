package ucb.edu.bo.virtlib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucb.edu.bo.virtlib.backend.model.RatingModel;

public interface RatingRepository extends JpaRepository<RatingModel, Long> {
}
