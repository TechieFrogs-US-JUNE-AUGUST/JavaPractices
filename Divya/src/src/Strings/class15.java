public class class15 {
    public static void main(String[] args){
        String d="divya";
       String firstletter=d.substring(0,1);           // this method gives gives the first letter of string d
       String remainingletters=d.substring(1,d.length());    //this substring contains remaining letters from index1
        firstletter  =firstletter.toUpperCase();              // it converts the first letter to uppercase
        d=firstletter+remainingletters;                  //adding of two substrings to get result
        System.out.println("name:"+d);
    }
}
