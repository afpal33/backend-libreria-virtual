package ucb.edu.bo.virtlib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucb.edu.bo.virtlib.backend.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}