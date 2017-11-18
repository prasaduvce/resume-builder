package com.example.resume.resumebuilder.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Assignment {

	@NotBlank
	private String organization;

	@NotNull
	private Date from;

	private Date to;

	@NotBlank
	private String project;

	@NotBlank
	private String customer;

	@NotBlank
	private String role;

	@NotBlank
	private String description;

	@NotEmpty
	private List<String> responsibilities;

	@NotBlank
	private String tools;

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
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

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(List<String> responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Assignment)) {
			return false;
		}
		Assignment that = (Assignment) o;
		return Objects.equals(getOrganization(), that.getOrganization()) &&
			   Objects.equals(getFrom(), that.getFrom()) &&
			   Objects.equals(getTo(), that.getTo()) &&
			   Objects.equals(getProject(), that.getProject()) &&
			   Objects.equals(getCustomer(), that.getCustomer()) &&
			   Objects.equals(getRole(), that.getRole()) &&
			   Objects.equals(getDescription(), that.getDescription()) &&
			   Objects.equals(getResponsibilities(), that.getResponsibilities()) &&
			   Objects.equals(getTools(), that.getTools());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrganization(), getFrom(), getTo(), getProject(), getCustomer(), getRole(), getDescription(), getResponsibilities(), getTools());
	}

	@Override
	public String toString() {
		return "Assignment{" +
			   "organization='" + organization + '\'' +
			   ", from=" + from +
			   ", to=" + to +
			   ", project='" + project + '\'' +
			   ", customer='" + customer + '\'' +
			   ", role='" + role + '\'' +
			   ", description='" + description + '\'' +
			   ", responsibilities=" + responsibilities +
			   ", tools='" + tools + '\'' +
			   '}';
	}
}
