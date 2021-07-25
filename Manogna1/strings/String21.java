package strings;

import java.util.Scanner;

public class String21
 {
    public static void main(String[] args) 
    {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("ENTER STRING VALUES :");
        String str1=scannerObj.nextLine();
        String str2=scannerObj.nextLine();
        String result=scannerObj.nextLine();
        char[] str11=str1.toCharArray(),str22=str2.toCharArray(),res=result.toCharArray();
        int l1=str1.length();
        int l2=str2.length();
        int lr=result.length();
        if((l1+l2)!=lr)
        {
            System.out.println("String is not a valid shuffle of two strings ");
        }
        else
        {
            int flag=0;
            int i=0,j=0,k=0;
            while(k<lr)
            {
                if((i<l1) && str11[i]==res[k])
                {
                        i++;
                }
                else if((j<l2) && str22[j]==res[k])
                {
                    j++;
                }
                else
                {
                    flag=1;
                    break;
                }
                k++;
            }
            if(i<l1 || j<l2 )
            {
                System.out.println("String is not a valid shuffle of two strings ");
            }
            else
            {
                System.out.println("String is  a valid shuffle of two strings ");
            }
        }
        scannerObj.close();
    }
    
}
