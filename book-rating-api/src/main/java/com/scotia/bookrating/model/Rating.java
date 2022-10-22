package com.scotia.bookrating.model;

import lombok.Data;

@Data
public class Rating {
    private long id;
    private Book book;
    private int stars;
}
