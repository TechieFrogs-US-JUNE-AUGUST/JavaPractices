public class String27 {
    public static void main(String[] args){
    String s="divya";            // declare and initialise the string variable
        int temp=0;                    // set the temp variable with zero value
        int length=s.length();           // to find the length of the string
        String arr[]=new String[length*(length+1)/2];       // formula to find the subsets of the string
        for(int i=0;i<length;i++){                   // index starts from zero
            for (int j=i;j<length;j++){
                arr[temp]=s.substring(i,j+1);            // substring(0,0+1) to store in temp
                temp++;                                  // by increase temp variable size of array will be increase
            }
        }
        System.out.println("subsets of a given string are:");
        for(int i=0;i<arr.length;i++){                               // to print the subsets of a string
            System.out.println( arr[i]);
        }
    }
}
