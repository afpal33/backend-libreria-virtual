package ucb.edu.bo.virtlib.backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/amazon")
public class AmazonController {

    private final RestTemplate restTemplate;

    @Autowired
    public AmazonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/get-prices/{itemName}")
    public ResponseEntity<String> getPricesFromAmazon(@PathVariable String itemName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "548851825ac43f460f8ec20f2c8ab823");
        headers.set("X-RapidAPI-Host", "amazon-data-product-scraper.p.rapidapi.com");

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "https://amazon-data-product-scraper.p.rapidapi.com/products/{item}?api_key=548851825ac43f460f8ec20f2c8ab823",
                String.class,
                itemName
        );

        return ResponseEntity.status(responseEntity.getStatusCode())
                .headers(responseEntity.getHeaders())
                .body(responseEntity.getBody());
    }
}
