class EmployeeC{
    EmployeeC(){  //constructor with no parameters
        System.out.println(" Name" + "   Year of Join" + "    Address ");
    }
    EmployeeC(String name, int year, String address){    //constructor with parameters
        System.out.println(name + "    " + year + "    " + address);
    }
    }
    class employee9{
        public static void main(String[] args) {
        EmployeeC em = new EmployeeC();    //calling with no parameters, default one
        EmployeeC em1 = new EmployeeC("Robert",1994,"    64C - WallsStreat"); //calling with parameters
        EmployeeC em2 = new EmployeeC("Sam   ",2000,"    68D - WallsStreat");
        EmployeeC em3 = new EmployeeC("John  ",1999,"    26B - WallStreat");
    
    }
}
