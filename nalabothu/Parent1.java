 class Parent1 
{
    public static void main(String[] args)
    {
        Parent1 p=new Parent1();
        Child c=new Child();
        p.Parent();
        c.Child1();
        c.Parent();
    }
    
    private void Parent()
    {
        System.out.println("this is parent class");
    }
}
    class Child extends Parent1
    {
        public void Child1()
        {
            System.out.println("this is child class");
        }
    }
    

