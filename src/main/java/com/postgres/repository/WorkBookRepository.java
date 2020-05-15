package com.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgres.model.WorkBook;

@Repository
public interface WorkBookRepository extends JpaRepository<WorkBook, String> {

}
