import java.util.Scanner;
public class exer29 {// left pascal triangle
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        for (int i= 1; i<=n ; i++)  
{  
for (int j=i; j <n ;j++)              
{  
System.out.print(" ");  
}  
for (int k=1; k<=i;k++)   
{  
System.out.print("*");   
}   
System.out.println("");   
}   
for (int i=n; i>=1; i--)  
{  
for(int j=i; j<=n;j++)  
{  
System.out.print(" ");  
}  
for(int k=1; k<i ;k++)   
{  
System.out.print("*");  
}  
System.out.println("");  
}
}
}