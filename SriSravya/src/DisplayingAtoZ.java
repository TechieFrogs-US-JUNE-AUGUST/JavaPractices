public class DisplayingAtoZ {
    public static void main(String[] args){
        for(char ch=65;ch<=90;ch++){      //65 to 90 upper case
            System.out.print(ch+" ");
        }
        System.out.println();
        for(char ch=97;ch<=122;ch++){      //97 to 122 smaller case
            System.out.print(ch+" ");
        }
    }
}
