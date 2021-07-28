package StringsAssignment;
public class StringsAssignment2 {
    public static void main(String[] args) {
        String names[]= {"tarak","krishna","ram","yaznesh","sri","Tarak"}; //initializing array
        System.out.println("lexographical order");
        for(int i=0;i<(names.length-1);i++){  //taking each char from word to compare
            for(int j=i+1;j<names.length;j++){  //taking each char from word to compare
                if(names[i].compareTo(names[j])>0){  //using compare to method we are camparing string of i and j
                    String temp=names[i]; // storing i string in temp
                    names[i]=names[j]; // storing j string in i
                    names[j]=temp; // storing temp value in j
                    
                }
            }
            System.out.println(names[i]);  //printing the lexographical order
        }
       // System.out.println("lexographical order:");
       // for(int i=0;i<names.length;i++) // 
       // System.out.println(names[i]);
    }
}
