package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GoogleBooksService {

    private final RestTemplate restTemplate;
    private final String apiUrl;
    private final String apiKey;

    public GoogleBooksService(RestTemplate restTemplate,
                              @Value("${google.books.api.url}") String apiUrl,
                              @Value("${google.books.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }

    public String searchBooks(String query) {
        String url = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("q", query)
                .queryParam("key", apiKey)
                .build().toUriString();

        return restTemplate.getForObject(url, String.class);
    }
}
