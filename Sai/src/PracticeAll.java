public class PracticeAll {
    public static void main(String[] args) {
        int a=10, b=10;
        //PracticeAll obj = new PracticeAll();
        PracticeAll obj1 = new PracticeAll(a , b);
        obj1.method();

    }

        PracticeAll(){
            System.out.println("from the constructor");
        }
        PracticeAll(int c , int d){
            System.out.println(c+d);
        }
        void method(){
            System.out.println("from the method");
        }
        
}
