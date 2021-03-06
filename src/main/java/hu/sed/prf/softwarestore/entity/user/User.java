package hu.sed.prf.softwarestore.entity.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user",
		uniqueConstraints = @UniqueConstraint(name = "unique_emil", columnNames = {"email"}))
public class User implements Serializable {

	// FIXME: This number should be generated somehow
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	private String name;

	// TODO: Regex for the email
	private String email;

	// TODO: Add the folowing members!
	//private String password;

	// TODO: Store the time when the user registered
	//@Temporal(TemporalType.DATE)
	//private Date registerDate;

	// TODO: It would be nice to have a picture for the user's profile
	//private String picturePath;

	// TODO: Additional members can be:
	//  - Address
	//  - Phone number
	//  - Birthdate
	// Most probably we won't need these for a simple webshop.


	public User() {
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
