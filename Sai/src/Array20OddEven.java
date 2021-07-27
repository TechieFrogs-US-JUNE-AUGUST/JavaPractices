public class Array20OddEven {
    public static void main(String[] args){
        int array[] = {10,23,31,41,54,6,7,8,9,21,};
        System.out.println("Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            System.out.println(array[index]);
        }    
        System.out.println(" Even Numbers in an Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            if(array[index]%2 == 0)// checking the value of particular index location numbder divisible by 2
                System.out.println(array[index]);
        }
        System.out.println(" Odd Numbers in an Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            if (array[index]%2 != 0)  //checking the number is not dividible by 0
                System.out.println(array[index]);
        }    
    }      
}
