package com.example.resume.resumebuilder.entities;

import java.util.Objects;
import javax.validation.constraints.NotBlank;

public class TechnicalSkills {

	@NotBlank
	private String technologies;

	@NotBlank
	private String tools;

	private String domainExperience;

	private String certifications;

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getDomainExperience() {
		return domainExperience;
	}

	public void setDomainExperience(String domainExperience) {
		this.domainExperience = domainExperience;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof TechnicalSkills)) {
			return false;
		}
		TechnicalSkills that = (TechnicalSkills) o;
		return Objects.equals(getTechnologies(), that.getTechnologies()) &&
			   Objects.equals(getTools(), that.getTools()) &&
			   Objects.equals(getDomainExperience(), that.getDomainExperience()) &&
			   Objects.equals(getCertifications(), that.getCertifications());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTechnologies(), getTools(), getDomainExperience(), getCertifications());
	}

	@Override
	public String toString() {
		return "TechnicalSkills{" +
			   "technologies='" + technologies + '\'' +
			   ", tools='" + tools + '\'' +
			   ", domainExperience='" + domainExperience + '\'' +
			   ", certifications='" + certifications + '\'' +
			   '}';
	}
}
