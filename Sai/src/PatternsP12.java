public class PatternsP12 {
    public static void main(String[] args) {
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i <= 5; i++){
            int ch = 65;
            int temp = i; // decresing the value of temp so i value goes to temp
            for (int j = i; j >= 0; j--){
                System.out.print((char) (ch + temp) + " ");
                temp = temp + 5; // from B to G we need to add 5 , 66(B) + 5 = 71(G)
            }
            System.out.println();
        }
    }
}
