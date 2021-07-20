package strings;

public class String37 {
    public static void main(String[] args) {
        String str="strings";
        char str1[]=str.toCharArray();
        System.out.println("Entered string is :" +str);
        System.out.println(str.length());
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str1[i]==str1[j])
                {

                System.out.println(str1[j] + " ");
                
                }
            }

        }

    }
    
}
