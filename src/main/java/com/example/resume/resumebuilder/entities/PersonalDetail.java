package com.example.resume.resumebuilder.entities;

import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

public class PersonalDetail {

	@NotNull
	private Date dateOfBirth;

	@NotBlank
	private String nationality;

	@NotBlank
	private String sex;

	@NotBlank
	private String maritalStatus;

	@NotBlank
	private String designation;

	@NotBlank
	private String location;

	@NotBlank
	private String permanentAddress;

	@NotBlank
	private String correspondanceAddress;

	@NotBlank
	private String place;

	@CreatedDate
	private Date resumeCreatedDate;

	@NotBlank
	private String signatureName;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCorrespondanceAddress() {
		return correspondanceAddress;
	}

	public void setCorrespondanceAddress(String correspondanceAddress) {
		this.correspondanceAddress = correspondanceAddress;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getResumeCreatedDate() {
		return resumeCreatedDate;
	}

	public void setResumeCreatedDate(Date resumeCreatedDate) {
		this.resumeCreatedDate = resumeCreatedDate;
	}

	public String getSignatureName() {
		return signatureName;
	}

	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PersonalDetail)) {
			return false;
		}
		PersonalDetail that = (PersonalDetail) o;
		return Objects.equals(getDateOfBirth(), that.getDateOfBirth()) &&
			   Objects.equals(getNationality(), that.getNationality()) &&
			   Objects.equals(getSex(), that.getSex()) &&
			   Objects.equals(getMaritalStatus(), that.getMaritalStatus()) &&
			   Objects.equals(getDesignation(), that.getDesignation()) &&
			   Objects.equals(getLocation(), that.getLocation()) &&
			   Objects.equals(getPermanentAddress(), that.getPermanentAddress()) &&
			   Objects.equals(getCorrespondanceAddress(), that.getCorrespondanceAddress()) &&
			   Objects.equals(getPlace(), that.getPlace()) &&
			   Objects.equals(getResumeCreatedDate(), that.getResumeCreatedDate()) &&
			   Objects.equals(getSignatureName(), that.getSignatureName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDateOfBirth(), getNationality(), getSex(), getMaritalStatus(), getDesignation(), getLocation(), getPermanentAddress(), getCorrespondanceAddress(), getPlace(), getResumeCreatedDate(), getSignatureName());
	}

	@Override
	public String toString() {
		return "PersonalDetail{" +
			   "dateOfBirth=" + dateOfBirth +
			   ", nationality='" + nationality + '\'' +
			   ", sex='" + sex + '\'' +
			   ", maritalStatus='" + maritalStatus + '\'' +
			   ", designation='" + designation + '\'' +
			   ", location='" + location + '\'' +
			   ", permanentAddress='" + permanentAddress + '\'' +
			   ", correspondanceAddress='" + correspondanceAddress + '\'' +
			   ", place='" + place + '\'' +
			   ", resumeCreatedDate=" + resumeCreatedDate +
			   ", signatureName='" + signatureName + '\'' +
			   '}';
	}
}
