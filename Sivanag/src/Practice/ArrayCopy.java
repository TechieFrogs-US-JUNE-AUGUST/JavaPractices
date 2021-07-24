package Practice;

public class ArrayCopy {
    public static void main(String[] args) {
        
   int[] ar1={1,2,3,4,8,9,10};
   int[] ar2=new int[20];
    System.arraycopy(ar1, 0,ar2, 6, 6);
    ArrayClone.displayArray(ar2);
    
}
    
}
