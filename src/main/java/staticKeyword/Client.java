package staticKeyword;

public class Client
{
    public static void main(String[] args)
    {
//        Generic generic = new Generic();
//        Generic generic1 = new Generic();
//        Generic generic2 = new Generic();
//        Generic generic3 = new Generic();
//        Generic generic4 = new Generic();
//        Generic generic5 = new Generic();
//        Generic generic6 = new Generic();
//        Generic generic7 = new Generic();
//        System.out.println(Generic.counter);

        Generic generic = new GenericChild();
        System.out.println(generic.id);
        System.out.println(generic.display());
    }
}
