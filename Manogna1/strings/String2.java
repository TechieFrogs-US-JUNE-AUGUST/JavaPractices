package strings;

public class String2 {
    public static void main(String[] args) {
        String words[]={"c","javascript","python","c++","java"};
        System.out.println(words.length);
        for(int i=0;i<(words.length-1);i++)//to compare each array element
        {
            for(int j=i+1;j<words.length;j++)//compare each array element
            {
                if(words[i].compareTo(words[j])>0)//compareto()method is used to perform comparision
                {
                        //swap words[i] with words[j] using temp
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("Lexographical order :");
        for(int i=0;i<words.length;i++)//use foreach loop to print words
        {
            System.out.println(words[i]);
        }
    }
    
}
