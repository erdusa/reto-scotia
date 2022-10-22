package com.scotia.bookrating.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Rating {
    @JsonIgnore
    private long id;
    private int stars;
}
