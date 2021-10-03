public class Assignment7 {
    static void displayArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter total number: ");
        int num=Assignment2.integerInput();
        System.out.println("Enter NUmbers: ");
        int nums[]=new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=Assignment2.integerInput();
        }
        System.out.print("Enter positions to replace : ");
        int pos[]=new int[2];
        pos[0]=Assignment2.integerInput();
        pos[1]=Assignment2.integerInput();
        System.out.println("Input: ");
        displayArray(nums);
        int temp=nums[pos[0]];
        nums[pos[0]]=nums[pos[1]];
        nums[pos[1]]=temp;
        System.out.println();
        System.out.println("Output: ");
        displayArray(nums);     
    }   
}
