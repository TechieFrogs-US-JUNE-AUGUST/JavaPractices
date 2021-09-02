package src.Assignment_Wipro;

public class Assignment9 {
    static Boolean primeNumberChk(int num)
    {
        int cnt=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            cnt++;
        }
        if(cnt>0)
            return false;
            else
            return true;
    }    
    public static void main(String[] args) {
        System.out.print("Enter Total numbers : ");
        int num=Assignment2.integerInput();
        System.out.println("Enter Numbers : ");
        int nums[]=new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=Assignment2.integerInput();
        }
        int k=0,temp;
        System.out.println("Input");
        Assignment7.displayArray(nums);
        for(int j=0;j<num;j++)
        {
            if(primeNumberChk(nums[j]))
            {
                temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k++;
            }
        }
        System.out.println();
        System.out.println("Output");
        Assignment7.displayArray(nums);
    }
}
