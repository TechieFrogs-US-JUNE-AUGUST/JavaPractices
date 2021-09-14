public class Ex3 {
    public static void main(String []args) {
        /*Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the input string : ");
        String str = scannerObj.nextLine();*/
        String string = "quick brown fox jumps over the lazy dog";
        char ch = 'a';
        occurance(string, ch);
    }
    static void occurance(String string, char ch){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurance of character a in a given string is :"+ count);
    }
}
