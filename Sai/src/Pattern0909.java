public class Pattern0909 {
    public static void main(String[] args) {
        int i, j, k;
        for(i=10; i>=1; i--){
            for(j=i; j<10; j++){
                System.out.print(j);
            }
            System.out.print("0"); // to pront 0 in the middle of the numbers
            for(k=9; k>=i; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
