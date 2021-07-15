public class Pattern11{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            int A=65;
            for(int j=i;j>=0;j--){
                System.out.print((char) (A+j)+" ");
            }
            System.out.println();
        }
    }
}