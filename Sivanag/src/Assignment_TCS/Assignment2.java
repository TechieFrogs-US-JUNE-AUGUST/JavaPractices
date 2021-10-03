import java.util.Scanner;

public class Assignment2 {
        static int avg(int[] oxygen)
        {
            int sum=0,avg;
            for(int i=0;i<oxygen.length;i++)
            {
                sum=sum+oxygen[i];
            }
            avg=sum/oxygen.length;
            return avg;
        }
        static int checkInput()
        {
            Scanner scannerObj =new Scanner(System.in);
            int v=0;
           
            do{
                while(!scannerObj.hasNextInt() )
                {
                   System.out.println("Enter Valid Oxygen Value");
                   scannerObj.next();
                }
                v=scannerObj.nextInt();     
            }while(v<=0 || v>100);
            //scannerObj.close();
            return v;
            
        }
    public static void main(String[] args) {
       
        System.out.println("There are 3 trainees");
        int[] tr1=new int[3];
        int[] tr2=new int[3];
        int tr3[]=new int[3];
        for(int i=0;i<3;i++)
        {
        System.out.println("Round"+(i+1));
        tr1[i]=checkInput();
        tr2[i]=checkInput();
        tr3[i]=checkInput();
        }
        if(avg(tr1)<70 && avg(tr2) < 70 && avg(tr3)<70)
            System.out.println("All Trainees are unfit");
      
        if(avg(tr1)==avg(tr2))
        {
            System.out.println("Trainee Number  : 1");
            System.out.println("Trainee Number  : 2");
        }
        if(avg(tr1)==avg(tr3))
        {
            System.out.println("Trainee Number  : 1");
            System.out.println("Trainee Number  : 3");
        }
        if(avg(tr2)==avg(tr3))
        {
            System.out.println("Trainee Number  : 2");
            System.out.println("Trainee Number  : 3");
        }
        //scannerObj.close();

    }
    
}
