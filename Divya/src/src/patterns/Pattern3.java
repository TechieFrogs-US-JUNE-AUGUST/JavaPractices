//import java.util.Scanner;
public class Pattern3{
 public static void main(String[] args){
  /*   char i,j,c;
    System.out.println("enter c value");
    Scanner s=new Scanner(System.in);
   c=s.next().charAt(0);*/
  for( char i='A';i<='F';i++){
     for( char j='A';j<=i;j++){
     System.out.print(j+" ") ;
     }
System.out.println();
}
for(char i='E';i>='A';i--){
    for( char j='A';j<=i;j++){
    System.out.print(j+" ") ;
    }
System.out.println();
}
//s.close();
}
}