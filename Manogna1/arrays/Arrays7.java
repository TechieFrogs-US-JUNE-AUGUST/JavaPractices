package arrays;

public class Arrays7 {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        System.out.println("Elements of given array present in Even Position");
        for(int i=1;i<array.length;i=i+2)
        {
            System.out.println(array[i]);
        }
    }
    
}
