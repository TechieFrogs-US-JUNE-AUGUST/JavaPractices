

public class Opps_A2_AssignPrint {
    public static void main(String[] args) {
        Student OBJ = new Student();//create an object
        OBJ.name ="SAM";
        OBJ.roll_no=2;
        OBJ.pno="8184811657";
        OBJ.address="Nizampet,hyderabad";
        Student OBJ1 = new Student();//create an object
        OBJ1.name ="JOHN";
        OBJ1.roll_no=3;
        OBJ1.pno="9640266605";
        OBJ1.address="Ameerpet,hyderabad";
        System.out.println("Student Name : " + OBJ.name);
        System.out.println("Student Roll No : " + OBJ.roll_no);
        System.out.println("Student Phone no : " + OBJ.pno);
        System.out.println("Student Address : " + OBJ.address);

        System.out.println("Student Name : " + OBJ1.name);
        System.out.println("Student Roll No : " + OBJ1.roll_no);
        System.out.println("Student Phone no : " + OBJ1.pno);
        System.out.println("Student Address : " + OBJ1.address);

    }
    
}
