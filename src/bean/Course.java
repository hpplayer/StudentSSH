package bean;

public class Course {
	private int id;
	private String cid;// 课程号
	private String cname;// 课程名
	private String kkxq;// 开课学期
	private String xs;// 学时
	private String xf;// 学分

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getKkxq() {
		return kkxq;
	}

	public void setKkxq(String kkxq) {
		this.kkxq = kkxq;
	}

	public String getXs() {
		return xs;
	}

	public void setXs(String xs) {
		this.xs = xs;
	}

	public String getXf() {
		return xf;
	}

	public void setXf(String xf) {
		this.xf = xf;
	}

}
