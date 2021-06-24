public class exer12 {// LCM of two numbers
    
    public static void main(String[] args){
  int num1 = 55;
  int num2 = 120;
int a;
a = (num1> num2)? num1 : num2;
while (true){
    if(a % num1 == 0 && a % num2 == 0){
System.out.println("LCM of two numbers is" + a);
break;
    }
    ++a;
}
    }
}