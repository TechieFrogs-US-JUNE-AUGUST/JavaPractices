class SubClass{
    int i=23;
    char ch= 'A';
    void tarak(){
        System.out.println(i);
        System.out.println(ch);
    }
}
public class SampleClass {
    
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.tarak();
    }
    
}
