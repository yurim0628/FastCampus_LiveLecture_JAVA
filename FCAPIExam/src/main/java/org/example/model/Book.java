package org.example.model;
// Lombok API

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String company;
    private String name;
    private int price;
}
