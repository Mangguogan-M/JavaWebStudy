package Three.entity;

public class User {
	private int uid;
	private String uname;
	private String password;

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + "]";
	}

	public User(int uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public static void main(String[] args) {
		String dno = "1";
		String dname = "2";
		String sql = "insert into dept values(dno, dname)";
		String sql2 = "insert into dept values("+dno+","+dname+")";
		String sql3 = "insert into dept values('"+dno+"','"+dname+"')";
		
		System.out.println(sql);
		System.out.println(sql2);
		System.out.println(sql3);
	}
}
