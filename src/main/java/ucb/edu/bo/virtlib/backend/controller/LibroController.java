package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.LibroService;
import ucb.edu.bo.virtlib.backend.model.LibroModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<LibroModel> getAllLibrosPrecios() {
        return libroService.getAllLibrosPrecios();
    }

    @GetMapping("/{libroPrecioId}")
    public ResponseEntity<LibroModel> getLibroPrecioById(@PathVariable Long libroPrecioId) {
        Optional<LibroModel> libro = libroService.getLibroPrecioById(libroPrecioId);
        return libro.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{libroPrecioId}")
    public ResponseEntity<Void> borrarLibroPrecioById(@PathVariable Long libroPrecioId) {
        libroService.borrarLibroPrecioById(libroPrecioId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<LibroModel> crearLibro(@RequestBody Map<String, String> body) {
        LibroModel nuevoLibro = libroService.crearLibro(body);
        return ResponseEntity.ok(nuevoLibro);
    }
}
