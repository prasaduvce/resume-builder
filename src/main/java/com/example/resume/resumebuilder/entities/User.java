package com.example.resume.resumebuilder.entities;

import java.util.Objects;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private String id;

	@NotBlank
	@Indexed(unique = true)
    private String username;

    @NotBlank
    private String name;

    private String address;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(getId(), user.getId()) &&
			   Objects.equals(getUsername(), user.getUsername()) &&
			   Objects.equals(getName(), user.getName()) &&
			   Objects.equals(getAddress(), user.getAddress()) &&
			   Objects.equals(getEmail(), user.getEmail()) &&
			   Objects.equals(getMobile(), user.getMobile());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getUsername(), getName(), getAddress(), getEmail(), getMobile());
	}

	@Override
	public String toString() {
		return "User{" +
			   "id='" + id + '\'' +
			   ", username='" + username + '\'' +
			   ", name='" + name + '\'' +
			   ", address='" + address + '\'' +
			   ", email='" + email + '\'' +
			   ", mobile='" + mobile + '\'' +
			   '}';
	}
}
