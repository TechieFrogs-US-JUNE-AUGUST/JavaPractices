import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // int num=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value");
        int num=sc.nextInt();
        int i;
        for(i=1;i<=10;i++)
            System.out.println(num+ "*" +i+ "=" +num*i);
            sc.close();
    }
}
