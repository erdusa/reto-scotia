package com.scotia.bookrating.client;

import com.scotia.bookrating.client.fallback.BookClientFallback;
import com.scotia.bookrating.config.FeignClientConfiguration;
import com.scotia.bookrating.config.LoadBalancerConfiguration;
import com.scotia.bookrating.model.Book;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "book-api", path = "books", fallback = BookClientFallback.class, configuration = FeignClientConfiguration.class)
@LoadBalancerClient(name = "book-api",configuration= LoadBalancerConfiguration.class)
public interface BookClient {
    @GetMapping
    List<Book> getBooks();
}
