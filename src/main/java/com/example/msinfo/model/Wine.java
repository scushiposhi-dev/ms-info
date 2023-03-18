package com.example.msinfo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wine {
    private Long id;
    private String type;
    private String description;
}
