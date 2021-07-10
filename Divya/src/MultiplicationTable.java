                      // multiplication table by using for loop
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        int n;
        System.out.println("enter n value");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
       /* for(int i=1;i<=10;i++){
            System.out.println(+n+"*"+i+"="+n*i);
        }
    }
}*/
                      //multiplication table by using while loop
      int i=0;
      while(i<=10){
          i++;
       System.out.println(+n+"*"+i+"="+n*i);}
       s.close();
      }
  }