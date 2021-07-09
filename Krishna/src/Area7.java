import java.util.Scanner;
class Area7                                                        // class Area is created.
{    
    void returnArea(int l, int b)                                //method returnArea is created to return rectangle area.
      {
        System.out.println("Area of Rectangle " +(l*b)) ;
      }
    Area7(int l, int b)                                          // constructor area is created with length nd breath as parameters.
      {
        returnArea(l,b);
      }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle ");
        int l = sc.nextInt();
        System.out.println("Enter Breath of the Rectangle");
        int b = sc.nextInt();
        Area7 ar= new Area7(l,b);                             //  constructor is called in which method is called and executed.
        sc.close();
    }
}