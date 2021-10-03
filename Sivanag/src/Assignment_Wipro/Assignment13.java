public class Assignment13 {
    public static void main(String[] args) {
        System.out.print("Enter total Numbers: ");
        int num=Assignment2.integerInput();
        System.out.println("Enter Min and max range of numbers : ");
        int range[]=new int[2];
        range[0]=Assignment2.integerInput();
        range[1]=Assignment2.integerInput();
        System.out.println("Enter Numbers:");
        int nums[]=new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=Assignment2.integerInput();
        }
        System.out.println("Numbers donot lie between " + range[0] + " and " + range[1] + " are ");
        for(int j=0;j<num;j++)
        {
            if(nums[j]<range[0] || nums[j]>range[1])
            {
                System.out.print(nums[j] + " ");
            }
        }

    }
    
}
