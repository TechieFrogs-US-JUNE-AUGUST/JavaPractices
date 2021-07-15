import java.util.*;
public class Astring7{
    public static void main(String[] args){
        String sr1 = new String("Objects");
        String sr2 = new String("Objects");
        String sr3 = new String("Equal Objects");
        System.out.println(Objects.equals(sr1,sr2));
        System.out.println(Objects.equals(sr2,sr3));
        System.out.println(Objects.equals(sr1,sr3));
    }
}