public class Array7Even {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Orginal Array");
        for(int index=0 ; index<array.length ; index++){
            System.out.println(array[index]);
        }    
        System.out.println(" Array of Even Positions of an Orginal Array");
        for(int index=0 ; index<array.length ; index++){// index added 1 count here
            index++;                                    // add 1 more value to index, totally added by 2
            System.out.println(array[index]);           //printing even index location values
        }    
    }   
}
