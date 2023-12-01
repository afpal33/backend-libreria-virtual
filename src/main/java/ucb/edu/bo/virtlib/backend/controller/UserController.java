package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.UserService;
import ucb.edu.bo.virtlib.backend.model.UserModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserModel> getAllUsuarios() {
        return userService.getAllUsuarios();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserModel> getUsuarioById(@PathVariable Long userId) {
        Optional<UserModel> usuario = userService.getUsuarioById(userId);
        return usuario.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> borrarUsuarioById(@PathVariable Long userId) {
        userService.borrarUsuarioById(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<UserModel> addUsuario(@RequestBody UserModel usuario) {
        // Puedes agregar validaciones u operaciones antes de guardar el usuario en la base de datos
        UserModel nuevoUsuario = userService.addUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }
}
