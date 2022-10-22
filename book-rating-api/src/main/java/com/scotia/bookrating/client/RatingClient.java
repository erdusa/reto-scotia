package com.scotia.bookrating.client;

import com.scotia.bookrating.client.fallback.RatingClientFallback;
import com.scotia.bookrating.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "rating-api", path = "/ratings", fallback = RatingClientFallback.class)
public interface RatingClient {
    @GetMapping("/book/{id}")
    List<Rating> getRatingsByBook(@PathVariable("id") long bookId);
}
