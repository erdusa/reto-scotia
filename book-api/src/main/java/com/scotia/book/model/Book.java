package com.scotia.book.model;

import com.scotia.book.enums.TypeBookEnum;
import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private TypeBookEnum tipo;
}

