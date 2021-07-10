interface Measurable
{
    double getMeasure();

}
class Employee implements Measurable
{ 
    double measure[];
    public double getMeasure()
    {
        return measure;
    }
    double Average()
    {

        return 88;
    }
    Employee()
    {

    }
    Employee(double measure[])
    {
        this.measure=measure;
    }

}
public class Interface_Assignment2
{
    public static void main(String[] args)
    {
        double measure[]={20000,30000,50000,70000,90000,100000,1100000,120000,140000,1500000};
        Employee objE =new Employee(measure);
        



    }




}