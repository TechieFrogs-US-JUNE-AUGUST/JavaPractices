package Assignment.java;
public class FullPyramid {
    public static void main(String[] args) {
        int k=0;
        for (int i=1;i<=5;++i)
        {
            for(int j=1;j<=5-i; ++j)
            {
                System.out.println(" ");
            }
            while(k!=2*i-1)
            {
                System.out.println(" * ");
                ++k;
            }
            System.out.println("out of loops");
        }
    }
}