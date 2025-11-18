package deepVsShallowCopy;

public class Client
{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.id = 1;
        st.name = "John Doe";
        st.age = 101;
        st.setSalary(1800);
        st.enrolledExam = new Exam();

        //Feasible Method 1
        Student stCopy = new Student();
        stCopy.id = st.id;
        stCopy.name = st.name;
        stCopy.age = st.age;
        stCopy.setSalary(st.getSalary()); // only if access mutators are present

        //Feasible Method 2
        Student stCopyCopy = new Student(st);

        System.out.println("");

    }
}
