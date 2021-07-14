package Patterns;

public class Pattern3 {
    void UpperPrint(char aa)
    {
        for(char i='A';i<=aa;i++)
        {
            for(char j ='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void DownPrint(char aa)
    {
        int k=1;
        for(char i='A';i<=aa-1;i++)
        {
            for(char j ='A';j<=aa-k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            k++;
        }
    }


    public static void main(String[] args) {
        Pattern3 obj3 = new Pattern3();
        obj3.UpperPrint('F');
        obj3.DownPrint('F');
       

    }
    
}
