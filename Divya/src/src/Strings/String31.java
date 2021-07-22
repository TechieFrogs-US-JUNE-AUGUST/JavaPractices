public class String31 {
        // Java Program to capitalize each word in a string
    static String capitailizeWord(String str) {                          // Method to convert the string
                StringBuffer s = new StringBuffer();

        // Declare a character of space
        // To identify that the next character is the starting
        // of a new word
        char ch = ' ';
        for (int i = 0; i < str.length(); i++)   {         
            // If previous character is space and current
                    // character is not space then it shows that
                    // current letter is the starting of the word
                    if (ch == ' ' && str.charAt(i) != ' ')
                        s.append(Character.toUpperCase(str.charAt(i)));
                    else
                        s.append(str.charAt(i));
                    ch = str.charAt(i);
                }
        return s.toString().trim();                        // Return the string with trimming
    }
    public static void main(String args[]) {

        String s1 = "This Is a Java Program";                            // Declare the string

        s1 = s1.toLowerCase();                                  // Convert that string into lowercase
        System.out.println(capitailizeWord(s1));                     // Call the method to capitalize each word
            }
        }

