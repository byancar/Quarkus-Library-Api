package org.library.domain.service;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import org.library.domain.model.Book;
import org.library.domain.repository.BookRepository;
import org.library.application.utils.PageRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class BookService {

    @Inject
    BookRepository bookRepository;

    public Response listAll(PageRequest pageRequest) {
        return Response.ok(((PanacheRepository) bookRepository).findAll(Sort.by(pageRequest.getSortBy()))
                .page(Page.of(pageRequest.getPageNum(), pageRequest.getPageSize()))
                .list()).build();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }
}
