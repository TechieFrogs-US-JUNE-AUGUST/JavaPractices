public class exer5 {//Alphabet is vowel or consonant

    public static void main(String[] args){
        char ch = 'h';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch + "is vowel");
            break;
            default:
            System.out.println(ch +  "is consonent");

        }
    }
    
}