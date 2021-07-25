public class Array12Sum {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int index=0; index<array.length; index++){
            sum = sum + array[index];
        }
        System.out.println("Sum of total elements an array is : "+sum);

    }
    
}
