public class CharacterIsAlphabet {
    public static void main(String[] args){
        char ch='1';
        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
            System.out.println("It is an alphabet");
        }else{
            System.out.println("It is not an alphabet");
        }
    }
}
