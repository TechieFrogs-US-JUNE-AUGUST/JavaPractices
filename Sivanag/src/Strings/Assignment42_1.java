//Most repeated word in a string
package Strings;
public class Assignment42_1 {
    public static void main(String[] args) {
        String string1="afd afsd afd afd afsd fadsf afsd";
        System.out.println("Given String is " +string1);
        String string2[]=string1.split(" ");
        String string3[]=Assignment45.sortArray(string2);
        String string4=string3[0];
        int l=0;
        //string4=string3[0];
        for(int i=0;i<string2.length;i++)
        {
            int m=0;
            for(int j=i+1;j<string3.length;j++)
            {
                if(string3[i].equals(string3[j]))
                {
                //k++;
                i++;
                
                m++;
                }

            }
            if(l<m)
            {
                l=m;
                string4=string3[i];
            }
         
        }
        System.out.println("Most Repeated Word in String is : " +string4);
    }
    
}
