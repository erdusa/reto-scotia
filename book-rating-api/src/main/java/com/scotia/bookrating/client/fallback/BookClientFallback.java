package com.scotia.bookrating.client.fallback;

import com.scotia.bookrating.client.BookClient;
import com.scotia.bookrating.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookClientFallback implements BookClient {
    @Override
    public List<Book> getBooks() {
        return new ArrayList<>();
    }
}
