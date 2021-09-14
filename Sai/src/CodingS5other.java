public class CodingS5other {
    public static void main(String[] args) {
        int sum = 0;
        int n1 = 10, n2 = 100,n = 1;
        for(int i = n1; i < n2; i++){
            while(n <= i){
                if(i % n == 0){
                    sum = sum+n;
                    //n++;
                }
                n++;
            }
            if(sum == i){
                System.out.println("this is perfect number"+i);
            }
        }
        /*for(int n = 10; n< 100; n++){
            for(int i =1; i < n; i++ ){
                if(n % i == 0){
                    sum = sum+i;
                }
            }
            if(sum == n){
                System.out.println(n +" is perfect number");
            }//else 
             //   System.out.println("not");
        }*/
    }
}
