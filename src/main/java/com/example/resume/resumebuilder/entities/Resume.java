package com.example.resume.resumebuilder.entities;

import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "resume")
public class Resume {

	@Id
	private String id;

	@NotBlank
	private String fullName;

	@NotBlank
	@Email
	private String email1;

	@Email
	private String email2;

	@NotNull
	private Integer mobile;

	@NotBlank
	private String careerObjective;

	@NotBlank
	private String experienceSummary;

	@Valid
	@NotNull
	private TechnicalSkills technicalSkills;

	@Valid
	@NotEmpty
	private List<Qualification> qualifications;

	@Valid
	@NotEmpty
	private List<WorkExperience> workExperiences;

	private List<Assignment> assignments;

	private PersonalDetail personalDetail;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getCareerObjective() {
		return careerObjective;
	}

	public void setCareerObjective(String careerObjective) {
		this.careerObjective = careerObjective;
	}

	public String getExperienceSummary() {
		return experienceSummary;
	}

	public void setExperienceSummary(String experienceSummary) {
		this.experienceSummary = experienceSummary;
	}

	public TechnicalSkills getTechnicalSkills() {
		return technicalSkills;
	}

	public void setTechnicalSkills(TechnicalSkills technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}

	public void setPersonalDetail(PersonalDetail personalDetail) {
		this.personalDetail = personalDetail;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Resume)) {
			return false;
		}
		Resume resume = (Resume) o;
		return Objects.equals(getId(), resume.getId()) &&
			   Objects.equals(getFullName(), resume.getFullName()) &&
			   Objects.equals(getEmail1(), resume.getEmail1()) &&
			   Objects.equals(getEmail2(), resume.getEmail2()) &&
			   Objects.equals(getMobile(), resume.getMobile()) &&
			   Objects.equals(getCareerObjective(), resume.getCareerObjective()) &&
			   Objects.equals(getExperienceSummary(), resume.getExperienceSummary()) &&
			   Objects.equals(getTechnicalSkills(), resume.getTechnicalSkills()) &&
			   Objects.equals(getQualifications(), resume.getQualifications()) &&
			   Objects.equals(getWorkExperiences(), resume.getWorkExperiences()) &&
			   Objects.equals(getAssignments(), resume.getAssignments()) &&
			   Objects.equals(getPersonalDetail(), resume.getPersonalDetail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getFullName(), getEmail1(), getEmail2(), getMobile(), getCareerObjective(), getExperienceSummary(), getTechnicalSkills(), getQualifications(), getWorkExperiences(), getAssignments(), getPersonalDetail());
	}

	@Override
	public String toString() {
		return "Resume{" +
			   "id='" + id + '\'' +
			   ", fullName='" + fullName + '\'' +
			   ", email1='" + email1 + '\'' +
			   ", email2='" + email2 + '\'' +
			   ", mobile=" + mobile +
			   ", careerObjective='" + careerObjective + '\'' +
			   ", experienceSummary='" + experienceSummary + '\'' +
			   ", technicalSkills=" + technicalSkills +
			   ", qualifications=" + qualifications +
			   ", workExperiences=" + workExperiences +
			   ", assignments=" + assignments +
			   ", personalDetail=" + personalDetail +
			   '}';
	}
}
