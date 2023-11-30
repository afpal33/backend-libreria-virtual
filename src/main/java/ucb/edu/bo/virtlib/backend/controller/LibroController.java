package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucb.edu.bo.virtlib.backend.bl.LibroService;

@RestController
@RequestMapping("/api/v1/books")
public class LibroController {

    @Autowired
    private LibroService libroService;

}
