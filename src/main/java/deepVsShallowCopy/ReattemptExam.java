package deepVsShallowCopy;

public class ReattemptExam
{
    private int noOfAttemptsRemaining;

    public ReattemptExam(ReattemptExam original)
    {
        this.noOfAttemptsRemaining = original.noOfAttemptsRemaining;
    }
}
