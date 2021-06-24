
class PrimeNumbers {
    public static void main(String args[])
{
    int n=200;
    
    for(int i=2;i<=n;i++)
    {   
        int k=0;
        for(int j=1;j<i-1;j++)
        {
            if(i%j==0 && j!=1)
            k=1;
        }
        if(k==0)
        System.out.print(i +" ");

    }

}
    
}
