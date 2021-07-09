    public class Switch2{
        public static void main(String[] args) {
            int i=0;
            switch (i) {
                case 1:
                    int a=8;
                    if (a%2==0){
                        System.out.println("a is even");
                    }
                    else{
                        System.out.println("a is odd");
                    } break;
                case 2:
                    int age= 20;
                    if (age<18){
                        System.out.println("minor");
                    }
                    else if (18<=age && age<60){
                        System.out.println("major");
                    }
                    else if (age>=60 && age<100){
                        System.out.println("senior citizen");
                    }
                    break;
                case 3:
                    int b=2;
                    switch (b){
                        case 1:
                            System.out.println("Rama ");
                        case 2:
                            System.out.println("Krishna");
                    } break;
                case 4:
                    int marks= 70;
                    if (marks<40){
                        System.out.println("fail");
                    }
                    else if (40<=marks && marks<50){
                        System.out.println("passed in Third class");
                    }
                    else if (50<=marks && marks<65){
                        System.out.println("passed in Second class");
                    }
                    else if (65<=marks && 90>marks){
                        System.out.println("passed in First class");
                    }
                    else if(90<=marks && marks<100){
                        System.out.println("passed in distinction");
                    }
                    else{
                        System.out.println("invalid");
                    } break;
                default:
                    System.out.println("ABOVE 54 LINES CODE IS USELESS");
            }
        }
    }


