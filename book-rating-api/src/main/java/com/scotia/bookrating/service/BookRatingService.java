package com.scotia.bookrating.service;

import com.scotia.bookrating.client.BookClient;
import com.scotia.bookrating.client.RatingClient;
import com.scotia.bookrating.model.Book;
import com.scotia.bookrating.model.Rating;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookRatingService {

    private BookClient bookClient;
    private RatingClient ratingClient;

    public BookRatingService(BookClient bookClient, RatingClient ratingClient) {
        this.bookClient = bookClient;
        this.ratingClient = ratingClient;
    }

    public List<Book> listBook() {
        return this.bookClient.getBooks()
                .stream()
                .peek(book -> {
                    List<Rating> ratings = this.ratingClient.getRatingsByBook(book.getId());
                    book.setRatings(ratings);
                }).collect(Collectors.toList());
    }

}
