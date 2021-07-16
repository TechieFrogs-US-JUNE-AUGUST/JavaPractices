
  public class StringBufferandStringBuilder {
    public static void main(String[] args) {
      StringBuffer sb=new StringBuffer("TeamHR");
    System.out.println(sb.length());          //4
    System.out.println(sb.capacity());        //20...default is 16 when we create empty string, but here I have given string value with 4 letters so 16+4=20 i.e,capacity increases by string lenght
      System.out.println(sb.append(" HelloAll"));          //we can add new string to the existing string with using stringbuffer append
    System.out.println(sb.length());                //13
    System.out.println(sb.capacity());              //20
      System.out.println(sb.insert(5, " Welcome "));      //with the index position 5, we can insert string
    System.out.println(sb.length());                 //22
    System.out.println(sb.capacity());               //(20*2)+2=42
      System.out.println(sb.replace(0, 3, "HiThere"));       //replaces with given string from 0th index and ends at 3rd index
      System.out.println(sb.delete(0, 3));                //delets from o to until 3rd index
      System.out.println(sb.deleteCharAt(0));             //delets only one char at 0th index
      System.out.println(sb.reverse());                  //reverses the string




      //default capacity will be 16 until the length of the string is 16
      //once the length exceeds 16 the formula of capacity is (old capacity*2)+2
      System.out.println(sb.length());   //22 
      System.out.println(sb.capacity());   //42
    //  System.out.println(sb.ensureCapacity(18));         //if the length exceeds more than 16 also the capacity will be set to 18 for all the next ones
    }
}
   
//StringBuffer and StringBuilder both functions same and are mutable
//STring bulider is non-synchronisized one and is faster compare to StringBuffer     





//Without using toString() method

/* class Student{
 int rollno;
 String name;

Student(int rollno, String name){
this.rollno=rollno;
this.name=name;
 }
 public static void main(String[] args) {
    Student s1=new Student(01, "Sam");
    System.out.println(s1);                  //compiler writes here as s1.toString()
 }                                           // o/p is --> Student@4617c264...because we didn't use toString method 
}      */


//With using toString() method

class Student{
    int rollno;
    String name;
   
   Student(int rollno, String name){
   this.rollno=rollno;
   this.name=name;
    }
    public String toString(){            //compiler internally calls this method and overriding this method returns the specified values
        return rollno+" "+name;
    }

    public static void main(String[] args) {
       Student s1=new Student(01, "Sam");
       System.out.println(s1);                  //compiler writes here as s1.toString()
    }                                           // o/p is --> 1 Sam
   }      