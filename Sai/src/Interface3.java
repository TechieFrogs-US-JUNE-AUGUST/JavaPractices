interface MyInterface{   // creating an interface
    void method1();  // in interface all methods are taken as "public" and "abstract" methods
    void method2();  // it takes like this - public abstract void method2();
    void method3();
}    
class Interface3 implements MyInterface{
    public void method1(){ // we need to provide public for interface methods,otherwise it takes as default.
        System.out.println("From Method 1");  //we can not reduce the visibility
    }
    public void method2(){
        System.out.println("From Method 2");
    }
    public void method3(){
        System.out.println("From Method 3");
    }
    public static void main(String[] args){
        MyInterface MyObj = new Interface3();
        MyObj.method1();
        MyObj.method2();
        MyObj.method3();
    }
}