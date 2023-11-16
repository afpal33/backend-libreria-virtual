package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.GoogleBooksService;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    private final GoogleBooksService googleBooksService;

    @Autowired
    public BooksController(GoogleBooksService googleBooksService) {
        this.googleBooksService = googleBooksService;
    }

    @GetMapping("/search")
    public String searchBooks(@RequestParam String query) {
        return googleBooksService.searchBooks(query);
    }
}
