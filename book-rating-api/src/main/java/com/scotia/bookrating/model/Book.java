package com.scotia.bookrating.model;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private List<Rating> ratings;
}
