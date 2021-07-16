public class Astring22{
    public static void main(String[] args){
        String str = "Checking the count of the total String";
        int count = 0;
        for(int i=0; i<str.length(); i++){ //checking the every position of the string
            if(str.charAt(i) != ' ') // checking for the spaces, if not space it will be char
                count++;  
        }
        System.out.println("Total number of characters in the string : " + count);
    }
}