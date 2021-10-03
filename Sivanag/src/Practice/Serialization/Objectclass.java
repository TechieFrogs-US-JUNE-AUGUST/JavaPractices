package Practice.Serialization;

import java.io.Serializable;



public class Objectclass implements Serializable {
    int eno;
    String ename;
    public static final long serialVersionUID=23;
    public Objectclass(int eno,String ename)
    {
        this.eno=eno;
        this.ename=ename;
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
    public void disp()
    {
        System.out.println(eno + "-" + ename);
    }
    
}
