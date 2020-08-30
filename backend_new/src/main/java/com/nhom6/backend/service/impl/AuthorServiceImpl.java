package com.nhom6.backend.service.impl;

import com.nhom6.backend.domain.Author;
import com.nhom6.backend.repository.AuthorRepository;
import com.nhom6.backend.service.AuthorService;
import com.nhom6.backend.service.dto.AuthorDTO;
import com.nhom6.backend.service.mapper.AuthorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Optional;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    private static final String ENTITY_NAME = "Author";
    private final Logger LOGGER = LoggerFactory.getLogger(AuthorServiceImpl.class);

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;
    private final EntityManager entityManager;

    public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper, EntityManager entityManager) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<AuthorDTO> findAll(Pageable pageable) {
        LOGGER.debug("Request to get all Authors");
        return authorRepository.findAll(pageable)
                .map(authorMapper::toDto);
    }

    @Override
    public Optional<AuthorDTO> findOne(Integer id) {
        LOGGER.debug("Request to get Author: {}", id);
        Optional<AuthorDTO> opt = authorRepository.findById(id)
                .map(authorMapper::toDto);
        return Optional.empty();
    }

    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {
        LOGGER.debug("Request to save Author : {}", authorDTO);
        Author author = authorMapper.toEntity(authorDTO);
//        author.setCreatedBy(SecurityUtils.getCurrentUserLogin().get());
//        author.setCreatedDate(Instant.now().truncatedTo(ChronoUnit.MILLIS));
//        author.setLastModifiedBy(SecurityUtils.getCurrentUserLogin().get());
//        author.setLastModifiedDate(Instant.now().truncatedTo(ChronoUnit.MILLIS));
        author = authorRepository.save(author);
        AuthorDTO result = authorMapper.toDto(author);
        return result;
    }
}
