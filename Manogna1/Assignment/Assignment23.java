package Assignment;

public class Assignment23 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++)
       
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.println("USB DEVICE");
            }
            else 
            {
                if(i%5==0)
                {
                    System.out.println("DEVICE");
                }
                else if (i%3==0)
                {
                    System.out.println("USB");
                }
                else
                {
                    System.out.println(i);
                }
            }   
        }
        
    }
    
}
