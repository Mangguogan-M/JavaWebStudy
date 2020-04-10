
package One.entity;

/*
 * 创建学生实体类
 */
public class Student {
	private int sid;//
	private String sname;// 姓名
	private int age;
	private String hobby;
	private String shows;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", hobby=" + hobby + ", shows=" + shows
				+ "]";
	}

	public Student() {
		super();
	}

	public Student(int sid, String sname, int age, String hobby, String shows) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.hobby = hobby;
		this.shows = shows;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getShows() {
		return shows;
	}

	public void setShows(String shows) {
		this.shows = shows;
	}

}
