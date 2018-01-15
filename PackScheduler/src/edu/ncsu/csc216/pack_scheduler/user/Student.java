package edu.ncsu.csc216.pack_scheduler.user;

/**
 * @author CeciliaYang
 *
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private String id;
	private String email;
	private String password;
	private int maxCredits;
	public static int MAX_CREDITS  = 18;
	
	public Student(String firstName, String lastName, String id, String email, String hashPW, int maxCredits) {
		// Set max credits value for specific student
		firstName = this.firstName; 
		lastName = this.lastName;
		id = this.id;
		email = this.email;
		hashPW = this.password;
		maxCredits = this.maxCredits;
	}

	public Student(String firstName, String lastName, String id, String email, String hashPW) {
		// Use default max credits value of 18
		firstName = this.firstName; 
		lastName = this.lastName;
		id = this.id;
		email = this.email;
		hashPW = this.password;
		maxCredits = MAX_CREDITS ;
	}
	
	/**
	 * Returns the Student's firstName
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the Course's firstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException();
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * Returns the Student's lastName
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/**
	 * Sets the Student's lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException();
		} else {
			this.lastName = lastName;
		}
	}
	
	/**
	 * Returns the Student's id
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	
	/**
	 * Sets the Student's id
	 * @param id
	 */
	private void setId(String id) {
		if (id == null || id.isEmpty()) {
			throw new IllegalArgumentException();
		} else {
			this.id = id;
		}
	}
	
	/**
	 * Returns the Student's email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the Student's email
	 * @param email
	 */
	public void setEmail(String email) {
		if ((email == null || email.isEmpty()) && 
				!email.contains("@") && 
				!email.contains(".") && 
				email.lastIndexOf(".") < email.indexOf("@")) {
			throw new IllegalArgumentException();
		} else {
			this.email = email;
		}
	}

	/**
	 * Returns the Student's password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the Student's password
	 * @param password
	 */
	public void setPassword(String password) {
		if (password == null || password.isEmpty()) {
			throw new IllegalArgumentException();
		} else {
			this.password = password;
		}
	}

	/**
	 * Returns the maxCredits
	 * @return maxCredits
	 */
	public int getMaxCredits() {
		return maxCredits;
	}

	/**
	 * Sets the maxCredits
	 * @param maxCredits
	 */
	public void setMaxCredits(int maxCredits) {
		if (maxCredits < 3 || maxCredits > 18) {
			throw new IllegalArgumentException();
		} else {
			this.maxCredits = maxCredits;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + maxCredits;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maxCredits != other.maxCredits)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return firstName + ", " + lastName + ", " + id + ", " + email
				+ ", " + password + ", " + maxCredits;
	}

}
