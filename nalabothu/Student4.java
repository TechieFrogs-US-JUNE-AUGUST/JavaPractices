public class Student4
 {
     Student4(String name,int age,String address)
     {
         System.out.println("name +age +Address");
     }
    public void setInfo(int name,int age)
    {
        System.out.println("name +age");
    }
    public void setInfo(String name[],int age[],String address[])
    {
        name={"nnr","nag","naga","nnr","nnn"};
        age={1,2,3,4,5};
       address={"1252 henderson ave"};
 }
    public static void main(String[] args)
   {
       Student4 obj=new Student4();
Student4("unknown",0,"1252 henderson ave");
obj.setInfo("nag",29);
}
 }