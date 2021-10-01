package src.Tcs_Assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment6
{
   static String  busStops[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
   static int[] path={800,600,750,900,1400,1200,1100,1500};
   static double getFare(String Source,String Destination)
   {
       int indexSource=0,indexDestination=0;
       double fare=0;
       indexSource=Arrays.asList(busStops).indexOf(Source);
       indexDestination=Arrays.asList(busStops).indexOf(Destination);
    // for(int i=0;i<8;i++)
    // {
    //     if(busStops[i].equals(Source))
    //     indexSource=i;
    //     if(busStops[i].equals(Destination))
    //     indexDestination=i;
    // }
    // System.out.println(indexSource);
    // System.out.println(indexDestination);
    if(indexSource < indexDestination)
    {
        for(int j=indexSource;j<indexDestination;j++)
        {
            fare=fare+ path[j];
        }
        return (int)Math.ceil((fare/1000)*5);    
    }
    else
    {
        for(int k=0;k<8;k++)
        {
            if(!(k<indexSource && k>=indexDestination))
                fare=fare+path[k];
        }
         return (int)((fare/1000)*5);
    }
   }
   public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.print("Enter Source Bus Stop : ");   
        String source=scannerObject.nextLine();
        System.out.print("Enter Destination Bus Stop : ");   
        String destination=scannerObject.nextLine();
        int cnt=0;
        if(source.equals(destination))
        System.out.println("Invalid Input");
        else
        {
        for(int i=0;i<8;i++)
        {
            if((busStops[i].equals(source) || busStops[i].equals(destination)))
            cnt++;
        }
        if(cnt!=2)
        System.out.println("Invalid Output");
        else
        
        System.out.println(getFare(source, destination) + " INR");
    }

        scannerObject.close();
   }
}