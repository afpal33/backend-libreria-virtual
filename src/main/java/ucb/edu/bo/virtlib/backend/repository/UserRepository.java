package ucb.edu.bo.virtlib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucb.edu.bo.virtlib.backend.model.UserModel;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findAll(); // Retrieve all users
    
    UserModel findById(long id); // Retrieve a user by ID
    
    UserModel save(UserModel user); // Save a user
    
    void delete(UserModel user); // Delete a user

    UserModel findByUsernameOrEmail(String username, String email); // Retrieve a user by username or email

    UserModel findByUsernameOrEmailAndPassword(String username, String email, String password); // Retrieve a user by username or email and password
}
