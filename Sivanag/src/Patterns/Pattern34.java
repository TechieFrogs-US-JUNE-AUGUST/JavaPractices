package Patterns;

public class Pattern34 {
    public static void main(String[] args) {
            
            int ref2=1;
            char ref1;
            for(int i=1;i<=9;i++)
            {
                int ref=0;
                if(i<6)
                {
                for(int j=ref2;j<=ref2+i-1;j++)
                {
                    ref=ref+i;
                    ref1=(char)(ref+64);
                    System.out.print(ref1);


                }
                ref2++;
                System.out.println();
            }else{
                for(int m=ref2;m<=ref2+(9-i);m++)
                {
                    ref=ref+i;
                    ref1=(char)(ref+64);
                    System.out.print(ref1);
                }
                ref2++;
                System.out.println();


            }

            }



    }
    
}
