package TheWorldCup;

import java.util.ArrayList;

public class Team {
    private String [] player = new String [11];
    private String TeamName,TeamCountry;
    private int participation,arrangement,NumberOfGoals ;
    private ArrayList <Match> matches = new ArrayList<>();

    public String [] getplayer (){
        return player ;
    }
    public void setPlayer (String [] player){
        this.player=player;
    }


    public String getTeamName(){
        return TeamName;
    }
    public void setTeamName(String TeamName){
        this.TeamName=TeamName;
    }


    public String getTeamCountry(){
        return TeamCountry;
    }
    public void setTeamCountry(String TeamCountry){
        this.TeamCountry=TeamCountry;
    }


    public int getParticipation(){
        return participation;
    }
    public void setParticipation(int participation){
        this.participation=participation;
    }


    public int getArrangement(){
        return arrangement;
    }
    public void setArrangement(int arrangement){
        this.arrangement=arrangement;
    }


    public int getNumberOfGoals(){
        return NumberOfGoals;
    }
    public void setNumberOfGoals(int numberOfGoals){
        this.NumberOfGoals=numberOfGoals;
    }


    public ArrayList <Match> getMatches(){
        return matches;
    }
    public void setMatches(Match match){
        this.matches.add(match);
    }




}
