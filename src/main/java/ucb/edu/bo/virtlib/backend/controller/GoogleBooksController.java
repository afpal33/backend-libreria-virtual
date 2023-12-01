package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.GoogleBooksService;
import ucb.edu.bo.virtlib.backend.model.GoogleBooksModel;  // Asume que tienes un modelo para representar los datos del libro

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/google-books")
public class GoogleBooksController {
    @Autowired
    private final GoogleBooksService googleBooksService;


    public GoogleBooksController(GoogleBooksService googleBooksService) {
        this.googleBooksService = googleBooksService;
    }

    @GetMapping("/search")
    public String searchBooks(@RequestParam String query) {
        return googleBooksService.searchBooks(query);
    }
    

}