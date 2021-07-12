abstract class Marks{  // abstract class 
    abstract double getPercentage(); // no body for an abstract method 
}
class AA extends Marks{  // abstract class Marks is inheritted by class AA
    int sub1, sub2, sub3;  
    public AA(int s1, int s2, int s3) {  // constructor with parameters
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    }
    double getPercentage() {   //method to return the percentage
    	return (sub1 + sub2 + sub3)/3;
    }
}
class BB extends Marks{ // inherits the abstract class
    int sub1, sub2, sub3, sub4;
    public BB(int s1, int s2, int s3, int s4) { // constructors with parameters
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    	sub4 = s4;
    }
    double getPercentage() { // method for percentage
    	return (sub1 + sub2 + sub3 +sub4)/4;
    }
}
class Abstract3{
	public static void main(String[] args){		
	    AA a = new AA(70, 80, 90);      //creating object of class AA
	    BB b = new BB(70, 85, 90, 85);  //creating object of class BB
	    System.out.println("Percentage of student AA : "+a.getPercentage());//getting the percentage
	    System.out.println("Percentage of student BB : " +b.getPercentage());
	}
}