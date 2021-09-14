import java.util.Arrays;

public class Ex3Otherway {
    public static void main(String[] args){
        String string = "quick brown fox jumps over the lazy dog";
        char charArray[] = string.toCharArray();
        System.out.println(Arrays.toString(charArray));
        int count = 0;
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == 'a')
            count++;
        }
        System.out.println(count);
    }
}
