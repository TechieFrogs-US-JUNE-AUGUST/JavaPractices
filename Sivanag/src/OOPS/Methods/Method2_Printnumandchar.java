package Methods;
class Printnumchars
{
    void Printnumchar(int n,char c)
    {
        System.out.println("Interger value :" +n + " Char :" + c);

    }
    void Printnumchar(char c,int n)
    {

        System.out.println("Char :" +n + " Interger value :" + c);
    }


}
public class Method2_Printnumandchar {
    public static void main(String[] args) {
        Printnumchars objnc =new Printnumchars();
        
        objnc.Printnumchar(40, 'm');
        objnc.Printnumchar('t', 30);
    }
    
}
