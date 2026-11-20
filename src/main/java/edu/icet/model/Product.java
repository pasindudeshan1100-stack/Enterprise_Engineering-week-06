package edu.icet.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private String name;
    private  String description;
    private Double price;
    private boolean isActive;

}
