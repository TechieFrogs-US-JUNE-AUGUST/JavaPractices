public class Example1 {
    public static void main(String[] args) {
        String str="My name is granar";
        char charArray[]=str.toCharArray();
        int maxDist= -1;
        int temporary;
        int max=0;int min=0;
        for(int i=0;i<charArray.length;i++)
        {   for(int j=i;j<charArray.length;j++)
            {
                if(charArray[i]=='a'&& charArray[j]=='a')
                {
                    max =i;
                   min=j;
                   System.out.println("Print max distance " +max);
                }
            }
        }
        System.out.println("Print max distance " +max);
    }
    

    
}
