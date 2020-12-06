package com.stepa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class News {
    String title;
    String description;
}
