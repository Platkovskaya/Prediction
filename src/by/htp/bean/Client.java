package by.htp.bean;

import java.util.Date;

public class Client {

	private String firstName;
	private String lastName;
	private Date lastDivinationDate;

	public Client(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastDivinationDate() {
		return lastDivinationDate;
	}

	public void setLastDivinationDate(Date lastDivinationDate) {
		this.lastDivinationDate = lastDivinationDate;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
