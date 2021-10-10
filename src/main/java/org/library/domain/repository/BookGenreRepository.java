package org.library.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.library.domain.model.BookGenre;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookGenreRepository implements PanacheRepository<BookGenre> {
}
