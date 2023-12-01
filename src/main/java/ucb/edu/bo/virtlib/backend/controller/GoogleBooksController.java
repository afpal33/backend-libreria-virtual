package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.GoogleBooksService;

@RestController
@RequestMapping("/api/v1/google-books")
public class GoogleBooksController {

    private final GoogleBooksService googleBooksService;

    @Autowired
    public GoogleBooksController(GoogleBooksService googleBooksService) {
        this.googleBooksService = googleBooksService;
    }

    @GetMapping("/search")
    public String searchBooks(@RequestParam String query) {
        return googleBooksService.searchBooks(query);
    }
}
