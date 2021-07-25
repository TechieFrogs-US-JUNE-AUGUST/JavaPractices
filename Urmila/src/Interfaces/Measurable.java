package Interfaces;

interface  Measurable {
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
 class AddMeasurable
{
    public static void main(String[] args)
    {
        double measure1 =30000;
        double measure2 =70000;
        Employee employee =new Employee(measure1,measure2);
        System.out.println(employee.Average());
    }
}
