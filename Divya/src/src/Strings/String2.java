public class String2 {
public static void main(String[] args){
    String names[]={"divya","renuka","revathi","bharathi"};          // declaring and initialising string array variables
        for(int i=0;i<names.length;i++){                    //index starts from [0] for finding  dictionary order
            for(int j=i+1;j<names.length;j++){            // second loop index starts from 1
                if(names[i].compareTo(names[j])>0){               //comparison of two string arrays when greater than 0
                    String temp=names[i];                //         swapping of two string arrays
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
System.out.println("lexicographical order:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        }
    }

