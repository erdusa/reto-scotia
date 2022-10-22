package com.scotia.bookrating.controller;

import com.scotia.bookrating.model.Book;
import com.scotia.bookrating.service.BookRatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRatingController {

    private BookRatingService bookRatingService;

    public BookRatingController(BookRatingService bookRatingService) {
        this.bookRatingService = bookRatingService;
    }

    @GetMapping
    public List<Book> listBook(){
        return this.bookRatingService.listBook();
    }

}
