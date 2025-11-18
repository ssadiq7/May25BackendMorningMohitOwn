package deepVsShallowCopy;

public class Exam
{
    private int id;
    private int score;
    ReattemptExam reattemptExam;

    public Exam()
    {
    }

    public Exam(Exam original)
    {
        this.id = original.id;
        this.score = original.score;
        this.reattemptExam = new ReattemptExam(original.reattemptExam);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
