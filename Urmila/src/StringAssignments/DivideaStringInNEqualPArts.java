package StringAssignments;

public class DivideaStringInNEqualPArts 
{
    public static void main(String[] args)
    {
        String str = "javaprograms";  
          
        int len = str.length();  //Stores the length of the string 
        int n = 3;  //n determines the variable that divide the string in 'n' equal parts  
        int temp = 0, chars = len/n;  
        
        String[] equalStr = new String [n];  //Stores the array of string     
        if(len % n != 0)//Check whether a string can be divided into n equal parts
        {  
            System.out.println(" Cannot be divided into "+ n +" equal parts");  
        }  
        else
        {  
            for(int i = 0; i < len; i = i+chars)
             {  
                String part = str.substring(i, i+chars);  //Dividing string in n equal part using substring() 
                equalStr[temp] = part;  
                temp++;  
            }  
                System.out.println(n + " equal parts of given string are ");  
                for(int i = 0; i < equalStr.length; i++) 
                {  
                System.out.println(equalStr[i]);  
                }  
            }  
    }
    
}
