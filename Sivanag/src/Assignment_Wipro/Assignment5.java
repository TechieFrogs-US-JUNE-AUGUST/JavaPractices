
public class Assignment5 {
    public static void main(String[] args) {
        System.out.print("Enter Total Numbers : ");
        int num=Assignment2.integerInput();
        int nums[]=new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=Assignment2.integerInput();
        }
        int sum=0,temp;
        for(int j=0;j<num;j++)
        {
            sum=0;
            while(nums[j]>0)
            {
                temp=nums[j]%10;
                sum+=temp;
                nums[j]/=10;
            }
            System.out.print(sum +" ");
        }
    }
    
}
