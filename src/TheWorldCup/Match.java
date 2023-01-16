package TheWorldCup;

public class Match {
   private int score1,score2;
   private String MatchPlace,referee;
   private Team [] teams = new Team [2];
   private boolean penalties, extraTime;

   private Team winnerTeam;

    void ShowStatistics(){
        System.out.println("----------------------------------------------------------------");
        System.out.println(teams[0].getTeamName() + "  /  " + teams[1].getTeamName());
        System.out.println(score1+ "  :  " + score2);
        System.out.println("Place: " + MatchPlace);
        System.out.println("Referee:" + referee);
        System.out.println("Penalties: " + penalties);
        System.out.println("Extra Time :" + extraTime);
        System.out.println("WINNER TEAM :" + winnerTeam.getTeamName());


    }
    public int getScore1(){
        return score1;
    }
    public void setScore1(int score){
        this.score1=score;
    }
    public int getScore2(){
        return score2;
    }
    public void setScore2(int score){
        this.score2=score;
    }

    public String getMatchPlace(){
        return MatchPlace;
    }

    public void setMatchPlace(String matchPlace){
        this.MatchPlace=matchPlace;
    }
    public String getReferee(){
        return referee;
    }
    public void setReferee(String referee){
        this.referee=referee;
    }

    public Team[] getTeams() {
        return teams;
    }
    public void setTeams(Team team,int index){
        teams[index]=team;
    }
    public boolean getpenalties(){
        return penalties;
    }
    public void setpenalties(boolean penalties) {
        this.penalties = penalties;
    }
    public boolean getextraTime(){
        return extraTime;
    }
    public void setextraTime(boolean extraTime){
        this.extraTime=extraTime;
    }

    public Team getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Team winnerTeam) {
        this.winnerTeam = winnerTeam;
    }
}

