public class Astring15{
    public static void main(String[] args){
        String cap = new String("capital");
        System.out.println(cap);
        String upper = cap.substring(0,1);//substring is used to get part of the string
        String remain = cap.substring(1, 7);//have to give index from where to where. saved the remaining string
        System.out.println(upper);
        upper = upper.toUpperCase();// it is used to change the characters to uppercase 
        System.out.println(upper);
        cap = upper + remain; //adding the changed letter and the remaining string together
        System.out.println(cap);
        
    } 
}