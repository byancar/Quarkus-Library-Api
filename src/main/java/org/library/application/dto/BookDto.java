package org.library.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private String author;
    private String publisher;
    private Integer edition;
    private Integer availibleQuantity;
    private Boolean isAvailible;
    //private String genre;
}
