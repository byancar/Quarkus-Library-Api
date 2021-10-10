package org.library.application.mapper;

import org.library.application.dto.BookDto;
import org.library.domain.model.Book;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "cdi")
public interface BookMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void toDto(BookDto bookDto, @MappingTarget Book book);

}
