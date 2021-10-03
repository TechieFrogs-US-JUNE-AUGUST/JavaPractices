

public class Assignment6 {
    public static void main(String[] args) {
        System.out.print("Enter Number of Dimensions : ");
        int numDim=Assignment2.integerInput();
        System.out.println("Enter Number of each Dimension:");
        int dims[]=new int[numDim];
        for(int i=0;i<numDim;i++)
        {
            dims[i]=Assignment2.integerInput();
        }
        int cnt=0;
        for(int j=0;j<numDim;j++)
        {
            if(Math.cbrt(dims[j])==(int)Math.cbrt(dims[j]))
            {
                cnt++;
            }
        }
        System.out.println("Perfect cube numbers of each dimensions are : " +cnt);
    }
    
}
