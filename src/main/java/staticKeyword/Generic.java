package staticKeyword;

public class Generic
{
    int id = 15;
    static int counter = 0;

    public Generic()
    {
        this.id = counter;
        counter++;
    }

    public static void setId(int id)
    {
        counter++;
    }

    public int display()
    {
        return 56;
    }
}

/*
* 1. Non-static methods can access static variables
* as well as non-static variables
* 2. Static methods can access only static variables
* */
