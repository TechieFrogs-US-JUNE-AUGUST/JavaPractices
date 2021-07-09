package Methods_assignment;
class one{                   //parent class
    int i;
    void PrintNum(){            //method 
        System.out.println(i);
    }
}
class two extends one{       //subclass with inheritance
     int j;
     void PrintNum(){         //method
         System.out.println(j);
     }
}
public class Prog7Ass3 {
    public static void main(String[] args){
      two obj=new two();                  //creating obj for subclass 
      obj.i=1;                            //assigning i/p values to variables using obj of subclass
      obj.j=2;
      obj.PrintNum();                     //calling method
    }
}
