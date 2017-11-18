package com.example.resume.resumebuilder.controllers;

import com.example.resume.resumebuilder.entities.Resume;
import com.example.resume.resumebuilder.repositories.ResumeRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

	private final ResumeRepository resumeRepository;

	@Autowired
	public ResumeController(ResumeRepository resumeRepository) {
		this.resumeRepository = resumeRepository;}

	@PostMapping(value = "/resumes")
	public Resume save(@RequestBody @Valid Resume resume) {
		return resumeRepository.save(resume);
	}
}
