package TheWorldCup;
import java.util.Random;
public class QuarterFinalMatch extends Match  {
    private int totalShoot,foulCount,penaltyCount;
    static Random random= new Random();

    public int getTotalShoot(){
        return totalShoot;
    }
    public void setTotalShoot(int totalShoot){
        this.totalShoot=totalShoot;
    }
    public int getFoulCount(){
        return foulCount;
    }
    public void setFoulCount(int foulCount){
        this.foulCount=foulCount;
    }
    public int getPenaltyCount(){
        return penaltyCount;
    }
    public void setPenaltyCount(int penaltyCount){
        this.penaltyCount=penaltyCount;
    }

    public void matchTeams(){
        String referee= Tournament.referees[random.nextInt(0, Tournament.referees.length)];
        String place= Tournament.places[random.nextInt(0,Tournament.places.length)];

        Team team1= Tournament.unmatchedTeams.get(random.nextInt(0,Tournament.unmatchedTeams.size()));
        for (Team team :Tournament.getteams()) {
            if (team.getTeamName().equals(team1.getTeamName())){
                team1=team;
            }
        }
        Tournament.unmatchedTeams.remove(team1);

        Team team2=Tournament.unmatchedTeams.get(random.nextInt(0, Tournament.unmatchedTeams.size()));
        for (Team team :Tournament.getteams()) {
            if (team.getTeamName().equals(team2.getTeamName())) {
                team2 = team;
            }
        }
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
            int penaltyCount=random.nextInt(0,3);

        Tournament.eliminatedTeam.remove(looserTeam);
        Tournament.addQuarterFinalMatch(score1,score2,referee,place,penalties,extraTime,team1,team2,
                winnerTeam,totalShoot,foulCount, penaltyCount);
    }
    @Override
    void ShowStatistics(){
        super.ShowStatistics();
        System.out.println("Total Shoot:"+totalShoot );
        System.out.println("Foul Count:"+foulCount );
        System.out.println("Penalty Count:"+ penaltyCount);

    }


       }

