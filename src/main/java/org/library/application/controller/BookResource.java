package org.library.application.controller;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.library.application.utils.PageRequest;
import org.library.domain.model.Book;
import org.library.domain.service.BookService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name="Books")
public class BookResource {

    @Inject
    BookService bookService;

    @GET
    public Response list(@BeanParam PageRequest pageRequest) {
        return bookService.listAll(pageRequest);
    }

    @GET
    @Path("/{id}")
    public Book get(@PathParam("id") Long id) {
        return bookService.findById(id);
    }

    @POST
    @Transactional
    public Response create(Book book) {
        book.persist();
        return Response.created(URI.create("/books/" + book.id)).build();
    }

//    @PUT
//    @Path("/{id}")
//    @Transactional
//    public Book update(@PathParam("id") Long id, Book book) {
//        Book entity = Book.findById(id);
//        if (entity == null) {
//            throw new NotFoundException();
//        }
//        return entity;
//    }
//
//    @PATCH
//    @Path("/{id}")
//    @Transactional
//    public Book patch(@PathParam("id") Long id, Book book) {
//        Book entity = Book.findById(id);
//        if (entity == null) {
//            throw new NotFoundException();
//        }
//        return entity;
//    }
//
//    @DELETE
//    @Path("/{id}")
//    @Transactional
//    public void delete(@PathParam("id") Long id) {
//        Book entity = Book.findById(id);
//        if (entity == null) {
//            throw new NotFoundException();
//        }
//        entity.delete();
//    }

}