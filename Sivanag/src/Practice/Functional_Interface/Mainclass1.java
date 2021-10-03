package Practice.Functional_Interface;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Mainclass1 {
    public static void main(String[] args) {
    
    System.out.println("Function");
    System.out.println("-----------");
    Function<Integer,String> fun=MethodClass :: isEvenOdd;
    String result =fun.apply(25);
    String result1 =fun.apply(20);
    System.out.println(result);
    System.out.println(result1);
    //------------------------
    System.out.println("BiFunction");
    System.out.println("-----------");
    BiFunction<Integer,Integer,String> bfun=MethodClass ::  multiTwonumbers;
    String mul=bfun.apply(10, 25);
    System.out.println(mul);
    //-----------------------
    System.out.println("Consumer");
    System.out.println("--------");
    Consumer<Integer> con=MethodClass :: isPrime;
    con.accept(121);
    //-----------------------
    System.out.println("BiConsumer");
    System.out.println("----------");
    BiConsumer<Integer,Integer> con1 = MethodClass :: greaterThen;
    con1.accept(20, 50);
    //-----------------------
    System.out.println("Predicate");
    System.out.println("---------");
    Predicate<Integer> pr = MethodClass :: isEven;
    boolean flag = pr.test(20);
    if(flag)
    System.out.println("Given Number is Even");
    else
    System.out.println("Given Number is Odd");
    //---------------------------
    System.out.println("BiPredicate");
    System.out.println("-----------");
    BiPredicate<String,String> bpr = MethodClass :: stringCompare;
    boolean flag1 = bpr.test("Hammsika", "Hammsika");
    if(flag1)
    System.out.println("Given Strings are same");
    else
    System.out.println("Given Strings are not Same");
    //-----------------------------------
    System.out.println("Supplier");
    System.out.println("--------");
    Integer rt=MethodClass.getnumber(20);
    String st = MethodClass.isEvenOdd(35);
    boolean b=MethodClass.stringCompare("Nihal", "NIHAL");
    Supplier<Integer> sup1=()->rt;
    Supplier<String> sup2 =()->st;
    Supplier<Boolean> sup3 = ()->b;
    System.out.println(sup1.get());
    System.out.println(sup2.get());
    System.out.println(sup3.get());
     

    }
    
}
