package com.example.resume.resumebuilder.entities;

import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Qualification {

	@NotEmpty
	private String degree;

	@NotEmpty
	private String passedOutYear;

	@NotEmpty
	private String institute;

	private String specialization;

	@NotNull
	private Double percentage;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getPassedOutYear() {
		return passedOutYear;
	}

	public void setPassedOutYear(String passedOutYear) {
		this.passedOutYear = passedOutYear;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Qualification)) {
			return false;
		}
		Qualification that = (Qualification) o;
		return Objects.equals(getDegree(), that.getDegree()) &&
			   Objects.equals(getPassedOutYear(), that.getPassedOutYear()) &&
			   Objects.equals(getInstitute(), that.getInstitute()) &&
			   Objects.equals(getSpecialization(), that.getSpecialization()) &&
			   Objects.equals(getPercentage(), that.getPercentage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDegree(), getPassedOutYear(), getInstitute(), getSpecialization(), getPercentage());
	}

	@Override
	public String toString() {
		return "Qualification{" +
			   "degree='" + degree + '\'' +
			   ", passedOutYear='" + passedOutYear + '\'' +
			   ", institute='" + institute + '\'' +
			   ", specialization='" + specialization + '\'' +
			   ", percentage=" + percentage +
			   '}';
	}
}
