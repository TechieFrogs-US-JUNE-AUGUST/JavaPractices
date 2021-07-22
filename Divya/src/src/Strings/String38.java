public class String38 {
    public static void main(String[] args) {
        String st = "this book is a book and pen is a pen ";
        int count;
        st = st.toLowerCase();             //Converts the string into lowercase

        String w[] = st.split(" ");       //Split the string into words using built-in function
        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < w.length; i++) {
            count = 1;
            for(int j = i+1; j < w.length; j++) {
                if(w[i].equals(w[j])) {
                    count++;
                    w[j] = "0";              //Set words[j] to 0 to avoid printing visited word
                }
            }

            if(count > 1 && w[i] != "0")              //Displays the duplicate word if count is greater than 1

                System.out.println(w[i]);
        }
    }
}

