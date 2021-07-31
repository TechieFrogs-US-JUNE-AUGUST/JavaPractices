package Patternsjava;
public class PatternAlphabet11 
{
  public static void main(String[] args)
  {
      int i,j;
    for(i=0;i<=50;i++)
    { 
    int  ch = 65;                    
    for(j=i;j>=0;j--)
    {
    System.out.print((char)(ch+j)+ ""); 
    }
    //ch++;
    System.out.println();
}
  }
    
}
