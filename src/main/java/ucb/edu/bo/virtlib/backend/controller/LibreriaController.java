package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.LibreriaService;
import ucb.edu.bo.virtlib.backend.model.LibreriaModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/library")
public class LibreriaController {

    @Autowired
    private LibreriaService libreriaService;

    @GetMapping("/all")
    public ResponseEntity<List<LibreriaModel>> getAllLibrosEnLibreria() {
        List<LibreriaModel> librosEnLibreria = libreriaService.getAllLibrosEnLibreria();
        return new ResponseEntity<>(librosEnLibreria, HttpStatus.OK);
    }

    @GetMapping("/{libroId}")
    public ResponseEntity<LibreriaModel> getLibroEnLibreriaById(@PathVariable Long libroId) {
        Optional<LibreriaModel> libroEnLibreria = libreriaService.getLibroEnLibreriaById(libroId);
        return libroEnLibreria.map(libro -> new ResponseEntity<>(libro, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{libroId}")
    public ResponseEntity<Void> borrarLibroEnLibreriaById(@PathVariable Long libroId) {
        libreriaService.borrarLibroEnLibreriaById(libroId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/agregar")
    public ResponseEntity<LibreriaModel> agregarLibroALibreria(
            @RequestParam Long usuarioId,
            @RequestParam Long libroPrecioId
    ) {
        LibreriaModel nuevoLibroEnLibreria = libreriaService.agregarLibroALibreria(usuarioId, libroPrecioId);
        return new ResponseEntity<>(nuevoLibroEnLibreria, HttpStatus.CREATED);
    }
}
