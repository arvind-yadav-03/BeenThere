package beenthere.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import beenthere.model.Admin;

@Entity
@Table(name = "AdminDetails")
public class AdminEntity 
{
	@Column(name = "Admin_Id")
	private Integer adminId;
	
	private String name;
	
	@Id
	private String email;
	
	private String password;
	
	private Integer wrongAttempts;
	
	// constructors
	public AdminEntity(){}
	
	public AdminEntity(Admin admin)
	{
		this.setName(admin.getName());
		this.setEmail(admin.getEmail());
		this.setAdminId(admin.getAdminId());
		this.setPassword(admin.getPassword());
		this.setWrongAttempts(0);
	}
	
	// getters and setters
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getWrongAttempts() {
		return wrongAttempts;
	}

	public void setWrongAttempts(Integer wrongAttempts) {
		this.wrongAttempts = wrongAttempts;
	}
}
