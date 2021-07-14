package Patterns;

public class Pattern5 {
    void Downback(char ff)
    {
        char ref;
        ref=ff;
        for(char i=ff;i>='A';i--)
        {
            for(char j=ref;j>='A';j--)
            {
                System.out.print(j);

            }
            System.out.println();
          ref--;
        }

    }
    void Upperback(char ff)
    {
        char ref;
        ref='A';
        for(char i=ff;i>='A';i--)
        {
            for(char j=ref;('A'<=j)&&(j<=ref);j--)
            {
                System.out.print(j);

            }
            System.out.println();
            ref++;
         
        }

    }
public static void main(String[] args) {
    Pattern5 obj5= new Pattern5();
    obj5.Downback('F');
    obj5.Upperback('F');
}


    
}
