public class Array8Odd{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            System.out.println(array[index]);
        }    
        System.out.println(" Array of Odd Positions of an Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            if(index%2 == 0) // checking the value is divisible by 2, it will give even index location elements
                System.out.println(array[index]);
        }    
    }   
}