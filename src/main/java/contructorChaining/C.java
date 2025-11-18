package contructorChaining;

public class C extends B
{
    public C()
    {
        super();
//        super(10);
        System.out.println("Constructor from C");
    }
}

// super() and this() should be the first line in the constructor <- Upto Java 21
