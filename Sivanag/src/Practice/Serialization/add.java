public class add {

    static void addelement(int s,int i,int n)
    {
        int sum=s;
        sum+=i;
        if(i<n)
            addelement(sum,++i, n);
            else
            System.out.println(sum);

    }
    public static void main(String[] args) {
        
        addelement(0,1,10);

    }
    
}
