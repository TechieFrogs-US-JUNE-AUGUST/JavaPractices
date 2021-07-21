import java.util.Scanner;
public class Astring27{
   static void subString(String str, int n){ ///to get all the subsets of a string
        for (int i = 0; i < n; i++)      //To select the starting index
        {
           for (int j = i+1; j <= n; j++)    //To select the ending index
            {
                System.out.println(str.substring(i, j));// giving the index locations for every loop
            }
        }
    }
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the string : "); 
        String str = scannerObj.nextLine();
        System.out.println("The entered string is "+str);
        System.out.println("All the substrings of the above string are : ");
        //Call to find the all the subsets of the string
        subString(str, str.length());
        scannerObj.close();
    }
}