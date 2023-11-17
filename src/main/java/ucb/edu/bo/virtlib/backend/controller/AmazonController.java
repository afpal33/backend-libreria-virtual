package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucb.edu.bo.virtlib.backend.bl.AmazonApiService;

@RestController
@RequestMapping("/api/v1/amazon")
public class AmazonController {

    private final AmazonApiService amazonApiService;

    @Autowired
    public AmazonController(AmazonApiService amazonApiService) {
        this.amazonApiService = amazonApiService;
    }

    @GetMapping("/getPrice/{productName}")
    public String getProductPrice(@PathVariable String productName) {
        return amazonApiService.getProductPrice(productName);
    }
}


