public class Armstrong {

    public static void main(String[] args) {

        int number = 153, Arm, remainder,Result= 0;
        Arm = number;           //arm=153

        while (Arm!= 0)
        {
            remainder = Arm% 10;
            Result+=Math.pow(remainder, 3);
            Arm=Arm/ 10;
        }

        if(Result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

/*
153%10=3           15%10=5             1%10=1
0+3,3=27         27+5,3=152       152+1,3=153
n=153/10=15         n=15/10=1      n=1/10=0
 */