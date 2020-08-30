package com.nhom6.backend.service;

import com.nhom6.backend.service.dto.AuthorDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AuthorService {
    Page<AuthorDTO> findAll(Pageable pageable);

    Optional<AuthorDTO> findOne(Integer id);

    AuthorDTO save(AuthorDTO authorDTO);
}
