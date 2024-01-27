package entity;

public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	private double comm;
	private String job;
	private String doj;
	private int mid;
	private int dno;
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, double salary, double comm, String job, String doj, int mid, int dno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.comm = comm;
		this.job = job;
		this.doj = doj;
		this.mid = mid;
		this.dno = dno;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", comm=" + comm + ", job=" + job
				+ ", doj=" + doj + ", mid=" + mid + ", dno=" + dno + "]";
	}
	
}
