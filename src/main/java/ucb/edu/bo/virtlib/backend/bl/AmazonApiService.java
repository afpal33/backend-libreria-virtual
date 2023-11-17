package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AmazonApiService {

    private final RestTemplate restTemplate;

    @Value("${amazon.api.url}")
    private String amazonApiUrl;

    @Value("${amazon.api.accessKey}")
    private String amazonAccessKey;

    @Value("${amazon.api.secretKey}")
    private String amazonSecretKey;

    public AmazonApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getProductPrice(String productName) {
        // Construir la URL de la API de Amazon
        String url = UriComponentsBuilder.fromUriString(amazonApiUrl)
                .queryParam("ProductName", productName)
                .build().toUriString();

        // Realizar la solicitud GET a la API de Amazon
        // Aquí deberías manejar la respuesta y extraer el precio
        String response = restTemplate.getForObject(url, String.class);

        // Supongamos que la respuesta contiene el precio
        String price = extractPriceFromResponse(response);

        return "Precio del producto " + productName + ": " + price;
    }

    private String extractPriceFromResponse(String response) {
        // Lógica para extraer el precio de la respuesta
        // Esto dependerá del formato de la respuesta de la API de Amazon
        // Aquí solo es un ejemplo simple
        return "$XX.XX";
    }
}
