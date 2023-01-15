package TheWorldCup;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        initiationTournament();
        System.out.println("Press Enter The Start Tournament:");
        scanner.nextLine();
        Tournament.createQuarterFinalMatch();
        System.out.println("Press Enter To Start Playing Quarter Final Matches");
        scanner.nextLine();
        Tournament.createSemiFinalMatch();
        System.out.println("Press Enter To Start Playing Semi Final Matches");
        scanner.nextLine();
        Tournament.createFinalMatch();
        System.out.println(Tournament.eliminatedTeam.get(0).getTeamName());
        System.out.println(Tournament.eliminatedTeam.size());

    }
    static void initiationTournament(){
        String tournamentName= "THE WORLD CUP";
        for(int i = 0; i<8; i++){
            System.out.println("Enter team name:"  );
            String teamName= scanner.nextLine();
            Tournament.addTeam(teamName,teamName);

        }
        Tournament.setEliminatedTeam();
        Tournament.setUnmatchedTeams();
        System.out.println(Tournament.unmatchedTeams.size());
        System.out.println(Tournament.eliminatedTeam.size());
        System.out.println(Tournament.getteams().size());




    }


}


