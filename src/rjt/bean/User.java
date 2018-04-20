package rjt.bean;

import java.util.Arrays;

public class User {
	String firstname;
	String lastname;
	String password;
	String gender;
	String[] skills;
	String city;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, String password, String gender, String[] skills, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.gender = gender;
		this.skills = skills;
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", gender="
				+ gender + ", skills=" + Arrays.toString(skills) + ", city=" + city + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
