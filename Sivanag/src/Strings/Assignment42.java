package Strings;

import java.io.File;
import java.util.Scanner;



public class Assignment42 {
    public static void main(String[] args) throws Exception {
        File file=new File("E:\\text.txt");
        Scanner scannerObj=new Scanner(file);
        System.out.println(file.length()); 
        String[] st=new String[(int) file.length()];
        //scannerObj.useDelimiter("e");
        int cnt=0;
        while(scannerObj.hasNextLine())
        {
             st=scannerObj.nextLine().split("\s");
             
             for(int k=0;k<st.length;k++)
             {
                 if(st[k].equals("")==false)
               {
                 System.out.println(st[k]);
                 cnt++;
               }
             }
        //System.out.println(scannerObj.nextLine());
        }
       
        System.out.println("Total number of words in a file is : " +cnt);
        scannerObj.close();
    }
    
}
