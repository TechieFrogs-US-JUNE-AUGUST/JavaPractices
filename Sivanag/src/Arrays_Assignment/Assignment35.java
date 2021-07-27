package Arrays_Assignment;

public class Assignment35 {
    public static void main(String[] args) {
        int[] array=Assignment1.assignArray();
        Assignment1.displayArray(array);
        double sd=0;
        double avg=Assignment34.averageArray(array);
        for (int i : array) {
            sd+=Math.pow(i-avg, 2);
            
        }
        System.out.println("Standard Deviation of Array Elements is : " + Math.sqrt(sd/array.length));
    }
    
}
