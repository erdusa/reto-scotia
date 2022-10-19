package com.scotia.book.controller;

import com.scotia.book.model.Book;
import com.scotia.book.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public boolean addBook(@RequestBody Book book) {
        return this.bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBook(@PathVariable int id) {
        return this.bookService.deleteBook(id);
    }

    @PutMapping
    public boolean updateBook(@RequestBody Book book) {
        return this.bookService.updateBook(book);
    }

    @GetMapping
    public List<Book> listBook() {
        return this.bookService.listBook();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") int idBook) {
        return this.bookService.getBook(idBook);
    }
}
