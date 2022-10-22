package com.scotia.rating.service;

import com.scotia.rating.model.Rating;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {
    private final List<Rating> ratingList = new ArrayList<>();

    public boolean addRating(Rating rating) {
        boolean ratingExist = ratingList.stream().anyMatch(r -> r.getId() == rating.getId());
        if (ratingExist) {
            throw new RuntimeException(String.format("El rating con id %d ya existe", rating.getId()));
        }

        return ratingList.add(rating);
    }

    public boolean deleteRating(int id) {
        return ratingList.removeIf(r -> r.getId() == id);
    }

    public boolean updateRating(Rating rating) {
        ratingList.stream().filter(r -> r.getId() == rating.getId())
                .forEach(r -> {
                    r.setBookId(rating.getBookId());
                    r.setStars(rating.getStars());
                });
        return true;
    }

    public List<Rating> listRating() {
        return this.ratingList;
    }

    public Rating getRating(int idRating) {
        return this.ratingList.stream()
                .filter(r -> r.getId() == idRating)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No existe un rating con ese id"));
    }

    public List<Rating> listRatingByBook(long bookId) {
        return this.ratingList.stream()
                .filter(b -> b.getBookId() == bookId)
                .collect(Collectors.toList());
    }

}
