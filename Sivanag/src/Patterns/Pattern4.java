package Patterns;

public class Pattern4 {
    void DownPrint(char aa)
    {
        int k=0;
        for(char i='A';i<=aa;i++)
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

    char in='F';
    Pattern4 obj44 = new Pattern4();
    Pattern3 obj43= new Pattern3();
    obj44.DownPrint(in);
    obj43.UpperPrint(in);
}
}
