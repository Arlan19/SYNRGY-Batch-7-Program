package Top2.InterfaceExke2;

public class FootballMatch implements Football {
    @Override
    public void homeTeamScored(int points) {
        System.out.println("score home team : " + points);
    }

    @Override
    public void visitingTeamScored(int point) {
        System.out.println("score visiting team : " + point);
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("Home Team : " + name);
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Visiting Team : " + name);
    }
}
