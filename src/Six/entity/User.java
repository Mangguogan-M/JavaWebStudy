package Six.entity;

public class User {
	private Integer idInteger;
	private String username;
	private String password;

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer idInteger, String username, String password) {
		super();
		this.idInteger = idInteger;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [idInteger=" + idInteger + ", username=" + username + ", password=" + password + "]";
	}

}
