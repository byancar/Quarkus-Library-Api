package org.library.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Book extends PanacheEntity {
    private String name;
    private String author;
    private String publisher;
    private Integer edition = 1;
    private Integer availibleQuantity = 1;

    private Boolean isAvailible = Boolean.TRUE;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private BookGenre genre;
}
