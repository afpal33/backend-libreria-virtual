package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GoogleBooksService {

    private final RestTemplate restTemplate;

    @Value("${google.books.api.url}")
    private String apiUrl;

    @Value("${google.books.api.key}")
    private String apiKey;

    @Autowired
    public GoogleBooksService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String searchBooks(String query) {
        String url = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("q", query)
                .queryParam("key", apiKey)
                .build().toUriString();

        return restTemplate.getForObject(url, String.class);
    }
}
