package com.scotia.book.service;

import com.scotia.book.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class BookService {
    private final List<Book> bookList = new ArrayList<>();

    public boolean addBook(Book book) {
        long nextId = bookList.stream().mapToLong(Book::getId).max().orElse(0) + 1;
        book.setId(nextId);
        return bookList.add(book);
    }

    public boolean deleteBook(int id) {
        return bookList.removeIf(b -> b.getId() == id);
    }

    public boolean updateBook(Book book) {
        bookList.stream().filter(b -> b.getId() == book.getId())
                .forEach(b -> {
                    b.setTitle(book.getTitle());
                    b.setAuthor(book.getAuthor());
                });
        return true;
    }

    public List<Book> listBook() {
        return this.bookList;
    }

    public Book getBook(int idBook) {
        return this.bookList.stream()
                .filter(b -> b.getId() == idBook)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No existe un libro con ese id"));
    }

}
