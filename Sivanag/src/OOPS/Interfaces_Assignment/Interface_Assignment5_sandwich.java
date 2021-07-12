public class Interface_Assignment5_sandwich implements FastFood
{
    String type;
    public String type()
    {
        return type;
    }
    Interface_Assignment5_sandwich()
    {

    }
    Interface_Assignment5_sandwich(String type)
    {
        this.type=type;
    }
 public static void main(String[] args) {
     Interface_Assignment5_sandwich obja5 = new Interface_Assignment5_sandwich("Noodles");
     System.out.println("Fast Food Type :" +obja5.type()); 
 }   
}
interface FastFood
{
String type();

}