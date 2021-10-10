package org.library.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class BookGenre extends PanacheEntity {
    private String name;
    private String description;
}
