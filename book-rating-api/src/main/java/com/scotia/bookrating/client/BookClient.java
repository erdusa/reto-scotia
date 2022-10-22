package com.scotia.bookrating.client;

import com.scotia.bookrating.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "book-api", path = "books")
public interface BookClient {
    @GetMapping
    List<Book> getBooks();
}
