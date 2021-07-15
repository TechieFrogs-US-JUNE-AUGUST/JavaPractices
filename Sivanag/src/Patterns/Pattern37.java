package Patterns;
public class Pattern37 {
    public static void main(String[] args) {
            for(char i='E';i>='A';i--)
            {
                for(char j='E';j>='A';j--)
                {
                    if(j>i)
                    System.out.print(j);
                    else
                    System.out.print(i);
                }
                System.out.println();

            }
    }
}
