package Patterns;

public class Assignment11 {
    public static void main(String[] args) {
        
        for(char i='a';i<='i';i++)
        {
            String s="";
            for(char j='a';j<=i;j++)
            {
                if(j>'a')
                s= s+"+"+j;
                else
                s=Character.toString(j);
            }
            System.out.print("("+ s +")");
            System.out.println("");
        }


    }
    
}
