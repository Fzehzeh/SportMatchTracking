package TheWorldCup;

import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    private static String TournamentName;
    private static ArrayList <Match> TeamsMatches = new ArrayList<>();
    private static  ArrayList <Team> teams = new ArrayList <> ();

    static ArrayList <Team> eliminatedTeam= new ArrayList<>();

    static ArrayList <Team> unmatchedTeams= new ArrayList<>(teams);

     static String [] places = {"Istanbul","NewYork","Toronto","London"};

     static String [] referees= {"Rıdvan","Dennis","Fırat","John"};
    static Scanner scanner = new Scanner (System.in);

    static void addTeam(String TeamName, String TeamCountry) {
            Team team = new Team();
            team.setTeamName(TeamName);
            team.setTeamCountry(TeamCountry);
            teams.add(team);
    }
    static void createFinalMatch(){
        for(int i=0; i<1; i++){
            FinalMatch finalMatch= new FinalMatch();
            finalMatch.matchTeams();
            finalMatch.ShowStatistics();
            scanner.nextLine();

        }
        Tournament.setUnmatchedTeams();
    }
    static void createSemiFinalMatch(){
        for(int i=0; i<2; i++){
            SemiFinalMatch semifinalMatch= new SemiFinalMatch();
            semifinalMatch.matchTeams();
            semifinalMatch.ShowStatistics();
            scanner.nextLine();
        }
        Tournament.setUnmatchedTeams();
    }
    static void createQuarterFinalMatch() {
        for (int i = 0; i < 4; i++) {
            QuarterFinalMatch quarterFinalMatch = new QuarterFinalMatch();
            quarterFinalMatch.matchTeams();
            quarterFinalMatch.ShowStatistics();
            scanner.nextLine();
        }
        Tournament.setUnmatchedTeams();
    }
    public static void setUnmatchedTeams(){
        unmatchedTeams= new ArrayList<>(eliminatedTeam);
    }

    public static void setEliminatedTeam(){
        eliminatedTeam= new ArrayList<>(teams);
    }

    public static String getTournamentName(){
        return TournamentName;
    }

    public static ArrayList<Match> getTeamsMatches() {
        return TeamsMatches;
    }

    public static ArrayList <Team> getteams(){
        return teams;
    }


}
