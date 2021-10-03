public class Assignment12 {
    static int[] sortInt(int[] num)
    {
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                if(num[i]<num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number of Students: ");
        int numStudents=Assignment2.integerInput();
        System.out.println("Enter each Student Score: ");
        int studentsScore[]=new int[numStudents];
        for(int i=0;i<numStudents;i++)
        {
            studentsScore[i]=Assignment2.integerInput();
        }
        System.out.println( sortInt(studentsScore)[0] +" " + sortInt(studentsScore)[1]);

       
    }
    
}
