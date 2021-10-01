import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("SAI");
        s = s.reverse();
        System.out.println(s);
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Give input");
            int a = obj.nextInt();
            System.out.println(a);
        }finally{}
        obj.close();
    }
    
}
