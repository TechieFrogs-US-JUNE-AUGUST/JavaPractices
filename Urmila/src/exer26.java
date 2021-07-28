public class exer26 {//Floyd's triangle

    public static void main(String[] args)
    {
        int a = 5, number = 1;
        for(int i = 1; i <= a; i++)
        {
        for(int j = 1; j<= i; j++)
        {
        System.out.print(number + "");
         ++number;
        }
         System.out.println();
        }
    }
}