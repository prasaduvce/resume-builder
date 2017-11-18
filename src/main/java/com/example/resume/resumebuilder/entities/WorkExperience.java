package com.example.resume.resumebuilder.entities;

import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class WorkExperience {

	@NotBlank
	private String organization;

	@NotBlank
	private String orgAddress;

	@NotBlank
	private String designation;

	@NotNull
	private Date from;

	private Date to;

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof WorkExperience)) {
			return false;
		}
		WorkExperience that = (WorkExperience) o;
		return Objects.equals(getOrganization(), that.getOrganization()) &&
			   Objects.equals(getOrgAddress(), that.getOrgAddress()) &&
			   Objects.equals(getDesignation(), that.getDesignation()) &&
			   Objects.equals(getFrom(), that.getFrom()) &&
			   Objects.equals(getTo(), that.getTo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrganization(), getOrgAddress(), getDesignation(), getFrom(), getTo());
	}

	@Override
	public String toString() {
		return "WorkExperience{" +
			   "organization='" + organization + '\'' +
			   ", orgAddress='" + orgAddress + '\'' +
			   ", designation='" + designation + '\'' +
			   ", from=" + from +
			   ", to=" + to +
			   '}';
	}
}
