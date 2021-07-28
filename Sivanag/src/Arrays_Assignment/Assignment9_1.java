package Arrays_Assignment;
import java.util.Scanner;
public class Assignment9_1
{
public static void main(String[] args) {
    Scanner scannerObj= new Scanner(System.in);
    System.out.print("Array Size : ");
    int size=scannerObj.nextInt();
    System.out.println("Enter Array Elements: ");
    String[] array1=new String[size];
    for(int i=0;i<size;i++)
    {
        array1[i]=scannerObj.nextLine();
    }
    int hnum=0;
    String hele=" ";
    for(int j=0;j<size;j++)
    {
        if(array1[j].length()>hnum)
        {
            hnum=array1[j].length();
            hele=array1[j];
        }
    }
    System.out.println("Largest Element in Array is : " + hele);
    scannerObj.close();
}
}