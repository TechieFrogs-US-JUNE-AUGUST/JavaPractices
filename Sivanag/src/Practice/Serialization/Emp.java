
import java.io.Serializable;


public class Emp implements Serializable
{
	int eno;
	String ename;
	transient String password;
    static transient String s="NAg";
    final transient int n=10;
	public static long serialVersionUID=101;
	public Emp(int eno, String ename,String password) 
	{
		this.eno = eno;
		this.ename = ename;
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
