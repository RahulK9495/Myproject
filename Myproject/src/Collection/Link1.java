package Collection;

public class Link1 {
	
	public int empno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public String empname;
	public String empadd;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empno+ " "+empname+" "+empadd;
	}

}
