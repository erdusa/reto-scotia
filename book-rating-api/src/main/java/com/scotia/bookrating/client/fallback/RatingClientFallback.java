package com.scotia.bookrating.client.fallback;

import com.scotia.bookrating.client.RatingClient;
import com.scotia.bookrating.model.Rating;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RatingClientFallback implements RatingClient {
    @Override
    public List<Rating> getRatingsByBook(long bookId) {
        return new ArrayList<>();
    }
}
