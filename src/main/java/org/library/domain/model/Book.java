package org.library.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Audited
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Book extends PanacheEntity {
    private String name;
    private String author;
    private String publisher;
    private Integer edition = 1;

    @Column(name = "availible_quantity")
    private Integer availibleQuantity = 1;

    @Column(name = "is_availible")
    private Boolean isAvailible = Boolean.TRUE;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private BookGenre genre;
}
