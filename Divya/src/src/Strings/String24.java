package Strings;

public class String24 {
    public static void main(String[] args) {
        String st = "This1 is a laptop2.";
        int vow = 0, cons = 0, dig = 0, spac = 0;
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); ++i) {                     // line = line.toLowerCase();
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {     // check if character is any of a, e, i, o, u
                ++vow;
            } else if ((ch >= 'a' && ch <= 'z')) {               // check if character is in between a to z
                ++cons;
            }
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
    }
}