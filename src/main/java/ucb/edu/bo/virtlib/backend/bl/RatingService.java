package ucb.edu.bo.virtlib.backend.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucb.edu.bo.virtlib.backend.model.RatingModel;
import ucb.edu.bo.virtlib.backend.repository.RatingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public List<RatingModel> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Optional<RatingModel> getRatingById(Long ratingId) {
        return ratingRepository.findById(ratingId);
    }

    public void borrarRatingById(Long ratingId) {
        ratingRepository.deleteById(ratingId);
    }

    public RatingModel agregarRating(RatingModel nuevoRating) {
        return ratingRepository.save(nuevoRating);
    }


}
