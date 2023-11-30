package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import ucb.edu.bo.virtlib.backend.repository.RatingRepository;

public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

}
