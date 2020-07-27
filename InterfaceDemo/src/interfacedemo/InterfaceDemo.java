package interfacedemo;

public class InterfaceDemo {

    public static void main(String[] args) {        
        MyClass a = new MyClass();        
        a.someMethod();
        
        System.out.println("The value of the constant is " + MyInterface.myInt);
        
        /*
        a.someDefaultMethod();
        MyInterface.someStaticMethod();
        */
        
    }    
}

class MyClass implements MyInterface
{
    @Override
    public void someMethod()
    {
        System.out.println("This is a method implemented in MyClass");   
    }    
}

interface MyInterface{
    
    int myInt = 5;    
    void someMethod();
    
    /*
    public static void someStaticMethod()
    {
	System.out.println("This is a static method in an interface");
    }
    
    public default void someDefaultMethod()
    {
	System.out.println("This is a default method in an interface");    
    }
    */

    
}