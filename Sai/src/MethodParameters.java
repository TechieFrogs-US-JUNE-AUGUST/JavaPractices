class Pass{
    public void value(int a, char c){
        System.out.println("Output of int and char :"+ a +" "+'a' );
    }
    public void value(char c, int a){
        System.out.println("Output of char and int :"+ 'b' +" "+ a);
    }
}
class MethodParameters{
    public static void main(String[] args){ 
        Pass ob = new Pass();
        ob.value(10,'c');
        ob.value('c',20);
    }
}

