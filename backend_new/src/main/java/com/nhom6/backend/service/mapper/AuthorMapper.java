package com.nhom6.backend.service.mapper;

import com.nhom6.backend.domain.Author;
import com.nhom6.backend.service.dto.AuthorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface AuthorMapper extends EntityMapper<AuthorDTO, Author> {
    default Author fromId(Integer id) {
        if (id == null) {
            return null;
        }
        Author author = new Author();
        author.setId(id);
        return author;
    }
}
