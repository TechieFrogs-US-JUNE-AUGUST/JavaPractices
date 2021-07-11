import java.util.Scanner;
class Area{         //creating a new class
    void returnArea(int l, int w){    
       System.out.println("Area of Rectangle " +(l*w)) ;
   }
   Area(int l, int w){          //method 
      returnArea(l,w);
   }
}
class AreaConMeth {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);      // scanner for values
   System.out.println("Enter the length : ");
   int l = sc.nextInt();                     // expecting the interger input
   System.out.println("Enter the width : ");
   int w = sc.nextInt();   
   Area arObj= new Area(l,w);   //calling method
   arObj.returnArea(l, w);
   sc.close();      //closing scanner
}
}