public class exer14 {//prime numbers

    public static void main(String[] args){
        int a = 0;
        int num = 0;
        String primeNumbers = "" ;
        for( a = 1; a<= 100; a++)
        {
            int counter = 0;
            for(num = a; num>=1; num--)
            {
                if(a%num==0){
                    counter = counter + 1;
                }
            }
if (counter ==2){
    primeNumbers = primeNumbers + a + "";
}
        }
        System.out.println( "PrimeNumbers between 1 and 100 are :" \n);
        System.out.println(primeNumbers);
    }
}    