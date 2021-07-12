class TwoStudents
{
  int r,p;
  String s,n;
    void display()
    {
        System.out.println("name is " +n);
        System.out.println("roll no is " +r);
        System.out.println(" phn no is " +p);
        System.out.println(" address is " +s);
  }
     public static void main(String[] args)
   {
      TwoStudents Obj= new TwoStudents();
        Obj.r=1;
        Obj.p=23456;
        Obj.s="64c-Wallstreet";
        Obj.n="sam";
        Obj.display();
      TwoStudents Obj1= new TwoStudents();
        Obj1.p=678910; 
        Obj1.s=" 65c-wall street"; 
        Obj1.n=" john" ;
        Obj1.r=2;
        System.out.println(); 
        Obj1.display();
   }
}