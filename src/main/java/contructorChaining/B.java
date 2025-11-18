package contructorChaining;

public class B extends A
{
    int x;
    int yy;
    int zz;
    public B(int x)
    {
//        this();
        this(10,20);
        System.out.println("Parameterized constructor from B");
        this.x = x;
    }

    public B()
    {
        this(10);
        x = 10;
        yy = 5;
        zz = 9;
        System.out.println("Constructor from B is called");
    }

    public B(int x, int y)
    {

    }
}
