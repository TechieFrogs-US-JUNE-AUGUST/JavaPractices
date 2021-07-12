public class Program2 {
    void intAndChar(int n,char c){
        System.out.println("integer and character values are:"+n+","+c);
    }
    void intAndChar(char c,int n){

        System.out.println("character and integer values are:"+c+","+n);
    }
    public static void main(String[] args){
        Program2 obj1=new Program2();
        obj1.intAndChar(3,'d');
        obj1.intAndChar('d',3);
        }
}
