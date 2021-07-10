package oops.Methods;
class Degree
{
    void getDegree()
    {
        System.out.println("I got Degree");

    }
}
class UnderGraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }

}
class PostGraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am a PostGraduate");
    }
}
public class Methods5_Degree
{
    public static void main(String[] args)
    {
        Degree objD = new Degree();
        objD.getDegree();
        UnderGraduate objU =new UnderGraduate();
        objU.getDegree();
        PostGraduate objp =new PostGraduate();
        objp.getDegree();

    }

    
}