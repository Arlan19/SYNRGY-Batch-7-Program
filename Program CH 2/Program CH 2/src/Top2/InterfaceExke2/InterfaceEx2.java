package Top2.InterfaceExke2;


public class InterfaceEx2 {
    public static void main(String[] args) {
        FootballMatch game = new FootballMatch();
        game.setVisitingTeam("MU");
        game.setHomeTeam("BARCA");
        game.visitingTeamScored(4);
        game.homeTeamScored(5);
    }
}
