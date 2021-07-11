interface MyStaticInterface{
    int i = 10;  // by default it takes static and final
     static void staticmethod1(){ // cannot override the static method of interface
        System.out.println("From StaticMethod 1");
    }
    static void staticmethod2(){
        System.out.println("From StaticMethod 2");
    }
    static void staticmethod3(){
        System.out.println("From StaticMethod 3");
    }
}    
class Interface4 implements MyStaticInterface{// class is implementing the interface
        public static void main(String[] args){
       // MyStaticInterface MyObj = new Interface4(); no need create an instance for static method
        MyStaticInterface.staticmethod1();  // accessing the static method from interface itself.
        MyStaticInterface.staticmethod2();
        MyStaticInterface.staticmethod3();
        System.out.println("i value : " +(MyStaticInterface.i));//i is a static variable, so cannot create
    }                                                        //instance. we need to call by interface name
}