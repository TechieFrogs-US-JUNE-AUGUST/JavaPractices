import java.util.Scanner;

//Using nextInt() //
/* public class Scanners {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int i=scan.nextInt();
    scan.close();  
 }
}   */

//Using next() for string//
public class Scanners {
    public static void main(String[] args) {
    //Scanner scan=new Scanner(System.in);
    String name="This is Sri Sravya";
    Scanner scan=new Scanner(name);
    //System.out.print("Enter a name: ");
    //String name=scan.next();
    System.out.println("Name is: "+name);
    scan.close();
    }
}    

//Using nextLine() for String//
/*  public class Scanners {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a name: ");
    String name1=scan.nextLine();
    //String name2=scan.nextLine();
    int i=scan.nextInt();
    System.out.println("Name1 is: "+name1);
    //System.out.println("Name2 is: "+name2);
    System.out.println("Value is: "+i);
    }
}   */

//Using next().charAt(0) for character//
/* public class Scanners {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a name: ");
    char ch=scan.next().charAt(0);
    System.out.println("Letter is: "+ch);
    scan.close();
    }
}    */

//Using nextboolean()//
/*  public class Scanners {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("True||False");
    Boolean b=scan.nextBoolean();
    System.out.println("Boolean value is: "+b);
    }
}    */
