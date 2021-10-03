public class Exception12Class {
    public static void main(String args[]) {
        try{
            System.out.println("From outer try block");
          /*  outerClass classObj = new outerClass() ;
        }catch (ClassNotFoundException ex){
            System.out.println("from outer catch block");       we have see this senario for class not 
            ex.printStackTrace();                               found exception
            try {
                System.out.println("From nested try block");
                outerClass  classObj = new outerClass() ;
            } catch (Exception e) {
                System.out.println("from nested catch block");
            }*/
        }finally{}
    }
}
class outerClass{
    void method(){
        System.out.println("From class 2 ");
    }
}