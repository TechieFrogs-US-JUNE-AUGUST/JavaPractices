public class String23 {
    public static void main(String[] args) {
        int count=0;
        String st = "Hai! this is a java #program.";
        for (int i = 0; i < st.length(); ++i) {                     // line = line.toLowerCase();
            char ch = st.charAt(i);
            if (ch == '!' || ch == '@' || ch == '$' || ch == '#' || ch == '&') {     // check if character is any of a, e, i, o, u
                ++count;
            }
        }
        System.out.println("number of punctuations in a given string are:"+count);
    }
}