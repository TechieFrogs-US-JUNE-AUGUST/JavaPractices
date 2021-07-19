public class String39 {
    public static void main(String[] args) {
        String str = "java is a java";                         // declaring string variable
        int[] freq = new int[str.length()];                // to find out length of the string
        char string[] = str.toCharArray();               //Converts given string into character array
        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';                     //Set string[j] to 0 to avoid character repeating
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");  // to display character and freuency
        for(int i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}


