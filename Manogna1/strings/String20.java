package strings;

public class String20 {
    public static void main(String[] args) {
        String str="String Assignment";
        String str1="Assignment";
        String str2="Program 20";
        int result=str.indexOf(str1);// check the name present in the string using IndexOf
        System.out.println("Result :" +result); //result!=-1
        if(result==-1)
        {
            System.out.println(str1+ " is not in the String"); 
        }
        else
        {
            System.out.println(str1+ " is Present in the String");//will execute
        }
        result=str.indexOf(str2);// check the name present in the string using IndexOf
        System.out.println("Result :" +result);//result==-1
        if(result==-1)
        {
            System.out.println(str2+ " is not in the String"); // will execute
        }
        else
        {
            System.out.println(str2+ " is Present in the String");
        }
    }
    
}
