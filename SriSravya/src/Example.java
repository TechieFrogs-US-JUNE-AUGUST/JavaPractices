 public class Example {
    static void zerosToEnd(int[] arr, int a){
        int count= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count++]= arr[i];
            }
        }
        for(int j=count; j<a; j++){
            arr[count++]= 0;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,0,0,0,3,6};
        zerosToEnd(arr,7);
        for(int i=0; i<7; i++){
            System.out.print(arr[i]+" ");
        }
    }
}        