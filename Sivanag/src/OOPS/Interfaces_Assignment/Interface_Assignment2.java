interface Measurable
{
    double getMeasure1();
    double getMeasure2();
}
class Employee implements Measurable
{ 
    double measure1;
    double measure2;
    double avg;
    public double getMeasure1()
    {
        return measure1;
    }
    public double getMeasure2()
    {
        return measure2;
    }
    double Average()
    {
        avg=(measure2 + measure1)/2;
        return avg;
    }
    Employee()
    {

    }
    Employee(double measure1,double measure2)
    {
        this.measure1=measure1;
        this.measure2=measure2;
    }

}
public class Interface_Assignment2
{
    public static void main(String[] args)
    {
        //double measure[]={20000,30000,50000,70000,90000,100000,1100000,120000,140000,1500000};
        double measure1 =50000;
        double measure2 =80000;
        Employee objE =new Employee(measure1,measure2);
        System.out.println(objE.Average());

        




    }




}