package Strings;

import java.io.File;
import java.util.Scanner;

public class Assignment41 {
    public static void main(String[] args) throws Exception {
        File file=new File("E:\\text.txt");
        Scanner scannerObj=new Scanner(file);
       // System.out.println(file.length()); 
       System.out.println("Duplicate Words in a file are : ");
        String[] st=new String[(int) file.length()];
             int cnt1=0;
        String[] st1= new String[(int) file.length()];
        while(scannerObj.hasNextLine())
        {
             st=scannerObj.nextLine().split("\s");
             
             for(int k=0;k<st.length;k++)
             {
                 if(st[k].equals("")==false)
               {
                 //System.out.println(st[k]);
                 
                 st1[cnt1]=st[k];
                 cnt1++;

               }
             }
     
        }

        
        for(int gg=0;gg<st1.length;gg++)
        {
            int hh=0;
            for(int gg1=gg+1;gg1<st1.length;gg1++)
            {
                if(st1[gg]!=null  && st1[gg].equals(st1[gg1]))
                {
                    hh=1;
                }

            }
            if(hh==1)
            {
                System.out.println(st1[gg] );
            }

        }
       
        //System.out.println("Total number of words in a file is : " +cnt);
        scannerObj.close();
    }
    
    
}
