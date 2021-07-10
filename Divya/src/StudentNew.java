public class StudentNew {
    int roll_number;
    int phone_number;
    String address;
    StudentNew(int r,int p,String n){
     roll_number=r;
     phone_number=p;
     address=n;
   System.out.println("roll number:"+roll_number+", "+"phone number:"+phone_number+", "+"Address:"+address);}
   public static void main(String[] args){
        System.out.println("Sam details:");
        StudentNew obj1=new StudentNew(1,99123106,"visakhapatnam");
        System.out.println("John details");
        StudentNew obj2=new StudentNew(2,123456,"Hyderabad");
   }

}
