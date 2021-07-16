import java.util.Scanner;
class Pattern2{
    public static void main(String[] args){
        char i,j,c;
        System.out.println("enter any character");
        Scanner s=new Scanner(System.in);
        c=s.next().charAt(0);
        for(i='A';i<=c;i++){
            for(j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
    }
    s.close();
}
}