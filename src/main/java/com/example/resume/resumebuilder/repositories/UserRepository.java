package com.example.resume.resumebuilder.repositories;

import com.example.resume.resumebuilder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
