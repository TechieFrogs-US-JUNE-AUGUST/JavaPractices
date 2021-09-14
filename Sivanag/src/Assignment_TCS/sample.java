package src.Tcs_Assignment;

public class sample {
    public static void main(String[] args) {
        int a[]={5,1,15,20,25};
        int i,j,m;
        System.out.println(a[1]);
        i=++a[1];
        System.out.println(a[1]);
        j=a[1]++;
        m=a[i++];
        System.out.println(i +" "+ j + " " +m);

    }
    
}
