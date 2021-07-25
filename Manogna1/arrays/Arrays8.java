package arrays;

public class Arrays8 {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        System.out.println("Elements of given array present in odd Position");
        for(int i=0;i<array.length;i=i+2)
        {
            System.out.println(array[i]);
        }
    }
    
}
