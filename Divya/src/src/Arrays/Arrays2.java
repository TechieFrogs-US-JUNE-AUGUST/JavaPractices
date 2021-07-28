package Arrays;
public class Arrays2 {
    public static void main(String[] args){
        int arr[]=new int[]{1,1,2,2,3,5,6,7,7,8,9,2,6};
        int frequency[]=new int [arr.length];
        int vis=-5;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j]=vis;
                }
            }
                if(frequency[i]!=vis){
                    frequency[i]=count;
                }
        }
        for(int i=0;i<frequency.length;i++){
             if(frequency[i]!=vis)
                System.out.println(arr[i]+" "+frequency[i]);
            }
        }
    }