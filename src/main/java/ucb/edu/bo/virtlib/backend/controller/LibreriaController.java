package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucb.edu.bo.virtlib.backend.bl.LibreriaService;

@RestController
@RequestMapping("/api/v1/library")
public class LibreriaController {
    @Autowired
    private LibreriaService libreriaService;
}
