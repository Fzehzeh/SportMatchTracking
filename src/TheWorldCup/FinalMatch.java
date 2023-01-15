package TheWorldCup;

public class FinalMatch extends SemiFinalMatch {
    private double ballPossessionPercentage;
    private int missedPositionCount,touchCount;
    public void matchTeams(){
        String referee= Tournament.referees[random.nextInt(0, Tournament.referees.length)];
        String place= Tournament.places[random.nextInt(0,Tournament.places.length)];

        Team team1= Tournament.unmatchedTeams.get(random.nextInt(0,Tournament.unmatchedTeams.size()));
        Tournament.unmatchedTeams.remove(team1);

        Team team2=Tournament.unmatchedTeams.get(random.nextInt(0, Tournament.unmatchedTeams.size()));
        Tournament.unmatchedTeams.remove(team2);

        Team winnerTeam;
        Team looserTeam=null;
        int score1= random.nextInt(0,5);
        int score2=random.nextInt(0,5);

        boolean extraTime=false;
        boolean penalties=false;

        if(score1==score2){
            extraTime=true;
            score1 += random.nextInt(0,3);
            score2 += random.nextInt(0,3);

            if(score1==score2) {
                penalties = true;
                int winnerNumber= random.nextInt(0, 1);
                if(winnerNumber==0){
                    winnerTeam=team1;
                    looserTeam=team2;
                }
                else  {
                    winnerTeam=team2;
                    looserTeam=team1;
                }
            }
            else if (score1 > score2){
                winnerTeam=team1;
                looserTeam=team2;
            }
            else {
                winnerTeam=team2;
                looserTeam=team1;
            }
        }
        else if (score1 > score2){
            winnerTeam=team1;
            looserTeam=team2;
        }
        else {
            winnerTeam=team2;
            looserTeam=team1;
        }
        int totalShoot=random.nextInt(7,15);
        int foulCount=random.nextInt(9,19);
        int penaltyCount=random.nextInt(0,4);
        int cardsCount=random.nextInt(0,7);
        int cournerCount=random.nextInt(7,12);
        int offsideCount=random.nextInt(3,8);
        double ballPossessionPercentage=random.nextDouble(0,100);
        int missedPositionCount=random.nextInt(15,25);
        int touchCount=random.nextInt(10,20);

        Tournament.eliminatedTeam.remove(looserTeam);
        Tournament.addFinalMatch(score1,score2,referee,place,penalties,extraTime,team1,team2,winnerTeam,
                ballPossessionPercentage,missedPositionCount, touchCount,cardsCount,cournerCount,offsideCount,
                totalShoot,foulCount,penaltyCount);
    }

    public double getBallPossessionPercentage(){
        return ballPossessionPercentage;
    }
    public int getMissedPositionCount(){
        return missedPositionCount;
    }
    public void setMissedPositionCount (int missedPositionCount){
        this.touchCount=touchCount;
    }
    public void setBallPossessionPercentage(double ballPossessionPercentage){
        this.ballPossessionPercentage=ballPossessionPercentage;
    }
    public double gettouchCount(){
        return touchCount;
    }
    public void setTouchCount(int touchCount){
        this.touchCount=touchCount;
    }

    @Override
    void ShowStatistics(){
        super.ShowStatistics();
        System.out.println("Missed Position Count:" + missedPositionCount );
        System.out.println("BallPossessionPercentage:" +ballPossessionPercentage );
        System.out.println("TouchCount:" +touchCount);


    }

}


