package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucb.edu.bo.virtlib.backend.model.UserModel;
import ucb.edu.bo.virtlib.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsuarios() {
        return userRepository.findAll();
    }

    public Optional<UserModel> getUsuarioById(Long usuarioId) {
        return userRepository.findById(usuarioId);
    }

    public void borrarUsuarioById(Long usuarioId) {
        userRepository.deleteById(usuarioId);
    }

    public UserModel addUsuario(UserModel usuario) {
        // Puedes agregar lógica adicional antes de guardar el usuario
        return userRepository.save(usuario);
    }
}
