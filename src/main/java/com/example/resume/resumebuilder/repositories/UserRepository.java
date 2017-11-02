package com.example.resume.resumebuilder.repositories;

import com.example.resume.resumebuilder.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
