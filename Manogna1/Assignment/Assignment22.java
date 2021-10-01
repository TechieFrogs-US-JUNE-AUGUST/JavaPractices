package Assignment;

public class Assignment22 {
    static int consecutiveOne(int[] array)
    {
        int count=0;//to check number of 1's
        int maxconsecutiveone=0; // to check max num of consecutive ones
       
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==1)
            {
                count++; //if it is one count value increases
                maxconsecutiveone=Math.max(count,maxconsecutiveone); //returns the max value
                
            }
            else
            {
                count=0;
            }
        }
        return maxconsecutiveone; // returns the max consecutive 1's
        
    }
    public static void main(String[] args) {
        int array[]={1,0,1,1,0,1,1,1,1,1,0};
        System.out.println(consecutiveOne(array));

    }
    
}
