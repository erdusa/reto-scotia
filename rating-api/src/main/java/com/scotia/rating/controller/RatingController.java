package com.scotia.rating.controller;

import com.scotia.rating.model.Rating;
import com.scotia.rating.service.RatingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping
    public boolean addRating(@RequestBody Rating rating) {
        return this.ratingService.addRating(rating);
    }

    @DeleteMapping("/{id}")
    public boolean deleteRating(@PathVariable int id) {
        return this.ratingService.deleteRating(id);
    }

    @PutMapping
    public boolean updateRating(@RequestBody Rating rating) {
        return this.ratingService.updateRating(rating);
    }

    @GetMapping
    public List<Rating> listRating() {
        return this.ratingService.listRating();
    }

    @GetMapping("/{id}")
    public Rating getRating(@PathVariable("id") int idRating) {
        return this.ratingService.getRating(idRating);
    }
}
