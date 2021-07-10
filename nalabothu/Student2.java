 class Student2   //main class
 {
    int roll_number;
    int phone_number;
    String address;
    String name;
    public static void main(String[] args) //main method
    {
        Student2 c1=new Student2(); //creating objects
        Student2 c2=new Student2();
        c1.roll_number=2;  //assigning values to object1 variables
        c1.phone_number=955;
        c1.address="henderson ave,claifornia";
        c1.name="sam";
        System.out.println(c1.roll_number+c1.phone_number+c1.address+c1.name);
        /*System.out.println(c1.phone_number);
        System.out.println(c1.address);
        System.out.println(c1.name);*/
        c2.roll_number=4;       //assigning values to object2 variables
        c2.phone_number=956;
        c2.address="henderson ave,claifornia";
        c2.name="john";
        System.out.println(c2.roll_number+c2.phone_number+c2.address+c2.name);
        //System.out.println(c2.phone_number);
        //System.out.println(c2.address);
        //System.out.println(c2.name);

    }
}



