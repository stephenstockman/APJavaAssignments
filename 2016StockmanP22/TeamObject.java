public class TeamObject
{
    private int teamNumber;
    private String teamName;
    private int[] scores;

    public TeamObject(int num, String nam, int[] sco)
    {
        teamNumber = num;
        teamName = nam;
        scores = sco;
    }

    public double getAverage()
    {
        double ave=0;
        for(int s : scores)
        {
            ave +=s;
        }
        ave=ave/8.0;
        return ave;
    }

    public int getNumber()
    {
        return teamNumber;
    }

    public void setNumber(int num)
    {
        teamNumber = num;
    }

    public String getName()
    {
        return teamName;
    }

    public void setName(String nam)
    {
        teamName = nam;
    }

    public int[] getScores()
    {
        return scores;
    }

    public void setScores(int[] sco)
    {
        scores = sco;
    }
}
