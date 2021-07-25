import java.util.Scanner;
class AreaR{         //creating a new class
    void returnArea(int l, int w){    
       System.out.println("Area of Rectangle " +(l*w)) ;
   }
   AreaR(int l, int w){          //method 
      returnArea(l,w);
   }
}
public class AreaConMeth {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);      // scanner for values
   System.out.println("Enter the length : ");
   int l = sc.nextInt();                     // expecting the interger input
   System.out.println("Enter the width : ");
   int w = sc.nextInt();   
   AreaR arObj= new AreaR(l,w);   //calling method
   arObj.returnArea(l, w);
   sc.close();      //closing scanner
}
}