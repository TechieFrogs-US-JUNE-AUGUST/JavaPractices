public class class1
{
    int eno;
    String ename;
    address add;
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
    public address getAdd() {
        return add;
    }
    public void setAdd(address add) {
        this.add = add;
    }
    public void dis()
    {
        System.out.println(eno + " " +  ename + " " + add.add);
    }


}