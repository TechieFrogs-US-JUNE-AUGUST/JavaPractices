package Assignment;

public class Assignment19 {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<1000;i++)
        {
            if(i%2!=0) // odd numbers 
            {
                count=count+i;
            }
        }
        System.out.println(count);
    }
    
}
