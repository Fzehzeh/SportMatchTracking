package TheWorldCup;

public class SemiFinalMatch extends QuarterFinalMatch{
    private int cardsCount,cournerCount,offsideCount;
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
        Tournament.eliminatedTeam.remove(looserTeam);

        this.setScore1(score1);
        this.setScore2(score2);
        this.setReferee(referee);
        this.setMatchPlace(place);
        this.setpenalties(penalties);
        this.setextraTime(extraTime);
        this.setTeams(team1,0);
        this.setTeams(team2,1);
        this.setWinnerTeam(winnerTeam);
        this.setCardsCount(cardsCount);
        this.setCournerCount(cournerCount);
        this.setOffsideCount(offsideCount);
        this.setTotalShoot(totalShoot);
        this.setFoulCount(foulCount);
        this.setPenaltyCount(penaltyCount);
        Tournament.getTeamsMatches().add(this);

        team1.setMatches(this);
        team2.setMatches(this);

    }
    public void createFixture(){
        for(int i=0; i<2; i++){
            matchTeams();
        }
        Tournament.setUnmatchedTeams();
    }

    public int getCardsCount(){
        return cardsCount;
    }
    public void setCardsCount(int cardsCount){
        this.cardsCount=cardsCount;
    }


    public int getCournerCount(){
        return cournerCount;
    }
    public void setCournerCount(int cournerCount){
        this.cournerCount=cournerCount;
    }


    public int getOffsideCount(){
        return offsideCount;
    }
    public void setOffsideCount(int offsideCount){
        this.offsideCount=offsideCount;
    }

    @Override
    void ShowStatistics(){
        super.ShowStatistics();
        System.out.println("Cards Count:" + cardsCount );
        System.out.println("Courner Count:"+ cournerCount );
        System.out.println("Offside Count:" + offsideCount);

    }


}



