package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int letter=65;
        for(int i=0; i<=5; i++){                     //prints rows
        int temp=i;
            for(int j=i; j>=0; j--){                 //prints columns
                System.out.print((char)(letter+temp)+" ");
                temp=temp+5;
        }
        System.out.println();
     }
   }
}
