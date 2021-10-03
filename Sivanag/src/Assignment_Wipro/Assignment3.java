import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        String string=scannerObj.nextLine();
        char ch[]=string.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]==' ')
            sum++;
            
        }
        System.out.println("Number of Special Characters and Spaces are "+ sum);
        scannerObj.close();
    }
    
}
