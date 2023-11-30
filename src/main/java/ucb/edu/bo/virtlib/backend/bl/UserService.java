package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import ucb.edu.bo.virtlib.backend.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

}
