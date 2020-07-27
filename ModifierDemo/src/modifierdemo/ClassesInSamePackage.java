package modifierdemo;

public class ClassesInSamePackage
{
	//just an empty class
}

class ClassA extends ModifierDemo
{
    public void printMessages()
    {
        //This is ok
        System.out.println(publicNum); 

        //This is ok
        System.out.println(protectedNum);

        //This is ok
        System.out.println(packagePrivateNum);

        //This is NOT ok
        System.out.println(privateNum);
    }
}

class ClassB
{
    public void printMessages()
    {

        ModifierDemo p = new ModifierDemo();

        //This is ok
        System.out.println(p.publicNum); 

        //This is ok
        System.out.println(p.protectedNum);

        //This is ok
        System.out.println(p.packagePrivateNum);

        //This is NOT ok
        System.out.println(p.privateNum);
    }
}
