package src.Coding_Assignment;
public class Assignment8 {
    static void sortDecending(int[] array)
    {
        int[] array1=new int[array.length];
        int[] array2=new int[array.length];
        int[] sortArray=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            if(checkPrevious(array, i))
            {
            int cnt=0;
            for(int j=i;j<array.length;j++)
            {
                if(array[i]==array[j])                 
                    cnt++;
            }
            if(cnt>0)
            {
                array1[i]=array[i];
                array2[i]=cnt;
            }
            }
        }
        displayArray(array1);
        displayArray(array2);
        int temp1,temp2;
        for(int m=0;m<array.length;m++)
        {
           for(int m1=m;m1<array.length;m1++)
           {
                if(array2[m]<array2[m1])
                    {
                        temp1=array2[m];
                        array2[m]=array2[m1];
                        array2[m1]=temp1;
                        temp2=array1[m];
                        array1[m]=array1[m1];
                        array1[m1]=temp2;
                    }
           }

        }
        displayArray(array1);
        displayArray(array2);
        int temp=0;
        for(int mm=0;mm<array.length;mm++)
        {
            
            if(array2[mm]!=0)
            {
                for(int k=0;k<array2[mm];k++)
                {
                    if(temp<array.length)
                    {
                    sortArray[temp]=array1[mm];
                    temp++;
                    }
                }
            }
        }
        int temp3;
        for(int b=0;b<array.length;b++)
        {
            if(checkDup(sortArray, b))
            {
                for(int bb=b;bb<array.length;bb++)
                {
                    if(sortArray[b]<sortArray[bb])
                    {
                        temp3=sortArray[b];
                        sortArray[b]=sortArray[bb];
                        sortArray[bb]=temp3;
                    }
                }
            }
        }
        displayArray(sortArray);
    }  
    static void displayArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static boolean checkPrevious(int[] array,int i)
    {
        for(int k=0;k<i;k++)
        {
            if(array[k]==array[i])
                return false;
        }
        return true;
    }
    static boolean checkDup(int[] array,int hh)
    {
        
            for(int j=0;j<array.length;j++)
            {
                if(hh!=j)
                {
                    if(array[hh]==array[j])
                        return false;
                }
            }
        
        return true;
    }
    public static void main(String[] args) {
        int[] array={2,5,6,2,3,5,5,8};
        sortDecending(array);
    }
}
