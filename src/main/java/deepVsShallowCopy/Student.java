package deepVsShallowCopy;

public class Student
{
    int id;
    public String name;
    protected int age;
    private int salary;
    Exam enrolledExam;
    Batch batch;

    public Student() {
    }

    //Copy Constructor
    public Student(Student original)
    {
        id = original.id;
        name = original.name;
        age = original.age;
        salary = original.salary;

        //deep copy
        enrolledExam = new Exam(original.enrolledExam);

        //shallow copy
        batch = original.batch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
