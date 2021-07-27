package Arrays;
import java.util.Scanner;
public class Arrays20 {
   static int arr[]=new int[5];
    public static void evenaOddMethod(int arrmeth[]){
         for(int i=0;i<arrmeth.length;i++){
             if(arrmeth[i]%2==0) {
                 System.out.println("even elements in given array:" + arrmeth[i]);
             }
                 else {
                 System.out.println("odd elements in a given array:" + arrmeth[i]);
             }
         }
      }
    public static void main(String[] args){
             Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        evenaOddMethod(arr);
    }
}