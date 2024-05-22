package Top4.TestFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("John", 800));
        players.add(new Player("Alice", 1200));
        players.add(new Player("Bob", 1500));
        players.add(new Player("Eve", 900));

        List<Player> playerWithMoreThat1000Points = players.stream().filter(p -> p.getPoints() > 1000).collect(Collectors.toList());
        System.out.println("Pemain dengan Point lebih dari 100 adalah ");
        for (Player player : playerWithMoreThat1000Points){
            System.out.println(player.getName() + " - " + player.getPoints() + " Point");
        }
    }
}
