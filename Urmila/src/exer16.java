public class exer16 {// Armstrong number
    
    public static void main(String[] args){
    int num = 173,originalNumber,remainder,result = 0;
    originalNumber = num;
    while(originalNumber != 0)
    {
        remainder= originalNumber % 10;
        result += Math.pow(remainder,3);
        originalNumber /= 10;
    }
    if(result == num)
    System.out.println(num + " is an Armstrongnumber.");
    else
    System.out.println(num + " is not an Armstrong number.");
    }
}