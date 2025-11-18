package deepVsShallowCopy;

public class Batch
{
    private int id;
    private String name;

    public Batch() {
    }

    public Batch(Batch original)
    {
        this.id = original.id;
        this.name = original.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
