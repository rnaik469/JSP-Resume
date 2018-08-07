package in.co.cg.servlet.model.resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.Part;

/**
 * @author rohit naik
 *
 */
public class Resume {
	
	// Instance members
	private String fName;
	private String lName;
	private String gender;
	private String hQualification;
	private String hobbies[];
	private String dob;
	private String address;
	private String skills[];
	private String email;
	private String website;
	private String contactNo;
	private String summary;
	private String arrayImageSource;
	
	// Getters and setters 
	public void setArrayImageSource(String arrayImageSource) {
		this.arrayImageSource = arrayImageSource;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String gethQualification() {
		return hQualification;
	}
	public void sethQualification(String hQualification) {
		this.hQualification = hQualification;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getArrayImageSource() {
		return arrayImageSource;
	}
	
	
	
	
}
