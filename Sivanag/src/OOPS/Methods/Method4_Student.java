package Methods;
class Student{
    String name;
    int age;
    String address;

    Student()
    {
        name ="unknown";
        age=0;
        address="not available";

    }
    void setinfo(String name ,int Age)
    {
        System.out.println("Student Name : "+ name + "\nStudent Age : +age") ;
    }
    void setinfo(String name ,int age,String address)
    {
        System.out.println("Student Name : "+ name + "\nStudent Age :" +age + "\nStudent Address : " +address) ;
    }

}

public class Method4_Student {
    public static void main(String[] args) {
        String nam[]={"Siv","Nag","Babu","Ram","Sam","Hari","Giri","Kiran","JP","CBN"};
        int age[]={30,40,35,25,32,28,25,42,50,60};
        String add[]={"Guntur","Vijayawada","Bheemavaram","Rajamandry","vizag","Hyderabad","Tirupathi","Nellore","Ananthapur","Chithoor"};
        Student objinfo =new Student();
        for(int i=0;i<nam.length;i++)
        {

            objinfo.setinfo(nam[i], age[i], add[i]);
        }

        
    }
    
}
