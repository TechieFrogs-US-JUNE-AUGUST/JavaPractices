public class students {
    int roll_no,phone_no;
    String address;
public static void main(String[] args){
    students Sam = new students();
    students John =  new students();
    Sam.roll_no = 12;
    John.roll_no = 13;
    Sam.phone_no = 228607;
    John.phone_no = 228008;
    Sam.address = "Hyderabad" ;
    John.address = "Ngkl";
    System.out.println(Sam.roll_no  + "" + Sam.phone_no + "" + Sam.address);
    System.out.println(John.roll_no + "" + John.phone_no + "" + John.address);
}
}