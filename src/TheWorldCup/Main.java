package TheWorldCup;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Press Enter The Start Tournament:");
        initiationTournament();
        System.out.println("Press Enter To Start Playing Quarter Final Matches");
        scanner.nextLine();
        Tournament.createQuarterFinalMatch();
        System.out.println("Press Enter To Start Playing Semi Final Matches");
        scanner.nextLine();
        Tournament.createSemiFinalMatch();
        System.out.println("Press Enter To Start Playing Final Match");
        scanner.nextLine();
        Tournament.createFinalMatch();
        System.out.println("******************** WINNER ********************");
        System.out.println("             " + Tournament.getTeamsMatches().get(6).getWinnerTeam().getTeamName());
        System.out.println("""
                     
                     ******************** 
                      *        *       *
                       *     * *      *
                  ******       *     ******
                    *    *     *    *    *
                      *   *  ***** *   *
                        *  *      *  *
                          * *    * *
                             *  *
                              **
                          **********
                        **************
                       ****************
                
                """);


        while(true){
            int count=1;
            for ( Team team  : Tournament.getteams() ) {
                System.out.println(count + " : " + team.getTeamName() );
                count++;

            }
            System.out.println("Select A Team");
            int input = scanner.nextInt();
            Tournament.getteams().get(input-1).ShowMatches();
        }
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
        
    }


}


