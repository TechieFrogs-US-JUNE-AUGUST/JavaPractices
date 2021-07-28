package Practice;

public class Spiral {
static void Forward(int num,int Ncolumn)
{
    for(;num<=Ncolumn;num++)
    {
        System.out.print(num +" ");
    }
}
static void Down(int num,int NRows)
{
    for(;num<=NRows;num++)
    {
        System.out.println(num +" ");
    }
}
static void Backward(int num,int Ncolumn)
{
    for(int k=Ncolumn;k>0;k--)
    {
        System.out.print(num +" ");
        num++;
    }
}
static void Up(int num,int Nrows)
{
    for(int k=0;k<Nrows;k++)
    {
        System.out.println(num +" ");
        num++;
    }
}

public static void main(String[] args) {
    Forward(1, 10);
    Down(1,10);
    Backward(1, 10);
    Up(1, 10);


}

    
}
