package com.akhadam.kitabi.repository;

import com.akhadam.kitabi.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    AuthorEntity findByName(String name);

    AuthorEntity findByAuthorId(String authorId);

}
