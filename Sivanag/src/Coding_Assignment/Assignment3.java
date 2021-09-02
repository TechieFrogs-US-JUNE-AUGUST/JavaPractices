package src.Coding_Assignment;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scannerObj.nextLine();
        char ch[]=string.toCharArray();
        int cntc=0,l=0;
        for(int i=0;i<ch.length;i++)
        {
            int cnt=0;
          for(int j=i;j<ch.length;j++)
          {
              if(ch[i]==ch[j])
                cnt++;
          }  
          if(cnt>cntc)
          {
            cntc=cnt;
            l=i;
          }
        }
        System.out.println("Maximum Occuring Character in a given String is :" +ch[l] +" "+cntc);
        scannerObj.close();
    }   
}
