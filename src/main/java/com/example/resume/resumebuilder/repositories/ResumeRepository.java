package com.example.resume.resumebuilder.repositories;

import com.example.resume.resumebuilder.entities.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends MongoRepository<Resume, String> {
}
