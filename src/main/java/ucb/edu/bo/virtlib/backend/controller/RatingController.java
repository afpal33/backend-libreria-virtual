package ucb.edu.bo.virtlib.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucb.edu.bo.virtlib.backend.bl.RatingService;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;
}
