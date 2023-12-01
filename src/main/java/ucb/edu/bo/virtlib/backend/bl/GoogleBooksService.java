package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ucb.edu.bo.virtlib.backend.model.GoogleBooksModel;
import ucb.edu.bo.virtlib.backend.repository.GoogleBookRepository;

import java.util.Optional;

@Service
public class GoogleBooksService {

    private final RestTemplate restTemplate;
    private final GoogleBookRepository googleBooksRepository;

    @Value("${google.books.api.url}")
    private String apiUrl;

    @Value("${google.books.api.key}")
    private String apiKey;

    @Autowired
    public GoogleBooksService(RestTemplate restTemplate, GoogleBookRepository googleBooksRepository) {
        this.restTemplate = restTemplate;
        this.googleBooksRepository = googleBooksRepository;
    }

    public String searchBooks(String query) {
        String url = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("q", query)
                .queryParam("key", apiKey)
                .build().toUriString();

        return restTemplate.getForObject(url, String.class);
    }

    public GoogleBooksModel getBookById(Long googleLibroId) {
        Optional<GoogleBooksModel> optionalBook = googleBooksRepository.findById(googleLibroId);
        return optionalBook.orElse(null);
    }
}
