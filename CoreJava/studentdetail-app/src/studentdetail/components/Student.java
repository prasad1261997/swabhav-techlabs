package studentdetail.components;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
	private String name = "";
	private String email = "";

	public void setId() {
		this.id = UUID.randomUUID();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return "Id = " + getId() + "\n Name =" + getName() + "\n Email ="
				+ getEmail();

	}

}
