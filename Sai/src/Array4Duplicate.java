public class Array4Duplicate {
    public static void main(String[] args){       
        int [] array = new int [] {1,2,3,4,3,2,1};
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++){  
                if(array[i] == array[j])  
                    System.out.println(array[j]); 
            }
        } 
    }
}
