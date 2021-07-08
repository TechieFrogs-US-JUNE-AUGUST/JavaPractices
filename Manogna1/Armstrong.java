public class Armstrong{ 
    public static void main(String[] args) {

    int number =251;
    int Arms, remainder,Result= 0;
    Arms = number;          

    while (Arms!= 0)
    {
        remainder = Arms% 10;
        Result+=Math.pow(remainder, 3);
        Arms=Arms/ 10;
    }

    if(Result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");
}
}
    