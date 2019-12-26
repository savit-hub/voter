package pojo;

public class VotersPojo {
	private int id;
	private String name;
	private String email;
	private String password;	
	private String status;	
	private String role;
	public VotersPojo() {
	
	}
	public VotersPojo(int id, String name, String email, String password, String status, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "VotersPojo [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status + ", role=" + role
				+ "]";
	}
	
	

}
