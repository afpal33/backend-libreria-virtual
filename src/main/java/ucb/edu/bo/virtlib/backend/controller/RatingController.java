package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucb.edu.bo.virtlib.backend.bl.RatingService;
import ucb.edu.bo.virtlib.backend.model.RatingModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @GetMapping("/all")
    public ResponseEntity<List<RatingModel>> getAllRatings() {
        List<RatingModel> ratings = ratingService.getAllRatings();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }

    @GetMapping("/{ratingId}")
    public ResponseEntity<RatingModel> getRatingById(@PathVariable Long ratingId) {
        Optional<RatingModel> rating = ratingService.getRatingById(ratingId);
        return rating.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{ratingId}")
    public ResponseEntity<Void> deleteRatingById(@PathVariable Long ratingId) {
        ratingService.borrarRatingById(ratingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/add")
    public ResponseEntity<RatingModel> addRating(@RequestBody RatingModel nuevoRating) {
        RatingModel createdRating = ratingService.agregarRating(nuevoRating);
        return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
    }

}
