package Arrays;

public class ArraysAssignment12 {
    public static void main(String[] args) {
        int array[]={1,2,3,5,4,6,8,7,9,10};
        int sum=0;
        for(int i=0;i<array.length;i++){
          sum=sum+array[i];
        }
        System.out.println("sum of all elements "+sum);
    }
}
