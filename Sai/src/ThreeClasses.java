class Degree{
    public void getDegree(){
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{   // Undergraduate is a subclass of Degree class
    public void getDegree(){
        System.out.println("Iam a undergraduate");
    }
}
class Postgraduate extends Degree{    // Postgraduate is a subclass of Degree class
    public void getDegree(){
        System.out.println("Iam a postgraduate");
    }
}
class ThreeClasses{
    public static void main(String[] args){
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();
        d.getDegree();
        u.getDegree();
        p.getDegree();
    }
}
