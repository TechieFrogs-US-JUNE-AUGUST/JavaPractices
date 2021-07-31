package Practice;

public class Searchletter1 {
    static void searchLetter1(String s,char c)
    {
        char ch[]=s.toCharArray();
        int num=s.indexOf(c);
        if(num<0)
        System.out.println(num +" No Occurance of "+ c);

    }
    public static void main(String[] args) {
        searchLetter1("the capital of minnesota is saint paul", 'y');
    }
    
}
