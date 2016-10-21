package objectclasses;

import java.util.Date;


public class Employee {
	
	public String firstName;
	public String middleName;
	public String lastName;
	public int socialSecurityNumber;
	public Date dateOfBirth;
	public String dob;
	public PostalAddress postalAddress;
	public EmergencyContact emergencyContact;
	public String phoneNumber;
	
	
	public Employee() {  }
	
	public Employee(String firstName, String middleName, String lastName, int socialSecurityNumber, Date dateOfBirth,
			PostalAddress postalAddress, String phoneNumber) {
		
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.postalAddress = postalAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public Employee(String firstName, String middleName, String lastName, int socialSecurityNumber, Date dateOfBirth,
			PostalAddress postalAddress, EmergencyContact emergencyContact, String phoneNumber) {
		
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.postalAddress = postalAddress;
		this.emergencyContact = emergencyContact;
		this.phoneNumber = phoneNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public String getLastName() {
		return lastName;
	}
	
	public String getDob() {
		return dob;
	}


	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public PostalAddress getPostalAddress() {
		return postalAddress;
	}


	public EmergencyContact getEmergencyContact() {
		return emergencyContact;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	private void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	private void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	private void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}


	private void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}


	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String fullNameAsString() {
		return String.format("%s %s %s", firstName, middleName, lastName);
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%s %s %s: phone number: %s\n%s\nEmergency Contact: %s", firstName, middleName, lastName, phoneNumber, postalAddress,emergencyContact);
	}

}
