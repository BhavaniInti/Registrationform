package Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class UserDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String Firstname;
	private String Lastname;
	private long PhoneNumber;
	private String Email;
	private String Gender;
	private String Course;
	public UserDetails() {
		
	}
	public UserDetails(int id, String firstname, String lastname, long phoneNumber, String email, String gender,
			String course) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		PhoneNumber = phoneNumber;
		Email = email;
		Gender = gender;
		Course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	

}
