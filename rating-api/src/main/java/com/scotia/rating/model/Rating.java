package com.scotia.rating.model;

import lombok.Data;

@Data
public class Rating {
    private long id;
    private int bookId;
    private int stars;
}
