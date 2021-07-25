package Abstractclasses;
 import java.util.Scanner;
abstract class Marks {// abstact method
        abstract double getPercentage();
    }
    class StudentA extends Marks{//creating subclass (inherits from main class Marks) 
        int english, telugu,hindi;
        StudentA(int english,int telugu, int hindi){//constructors
            this.english=english;// 
            this.telugu=telugu;
            this.hindi=hindi;
        }
        double getPercentage() { //setting getters
        return ((english+telugu+hindi)/3);
        }
    }
    class StudentB extends Marks{
        int english,telugu,hindi,social;
        StudentB(int english,int telugu,int hindi,int social){
            this.english=english;
            this.telugu=telugu;
            this.hindi=hindi;
            this.social=social;
           
        }
        double getPercentage() {
        return ((english+telugu+hindi+social)/4);
        }
    }
     class AddMarks {
        public static void main(String[] args) {// prints all subjects and their percentage of students
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter marks for english");
            int english=scanner.nextInt();
            System.out.println("enter marks for telugu");
            int telugu=scanner.nextInt();
            System.out.println("enter marks for hindi");
            int hindi=scanner.nextInt();
            System.out.println("enter marks for social");
            int social=scanner.nextInt();
            StudentA studenta= new StudentA(english,telugu,hindi );
            System.out.println("percentage of student A is : "+ studenta.getPercentage());
            StudentB studentb =new StudentB(english,telugu,hindi,social);
            System.out.println("percentage of student B is: "+ studentb.getPercentage());
        }
}

