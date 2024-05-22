package Top4.ContohOrderDiObject;

import Top4.TestFilter.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Top4.TestFilter.Player("John", 800));
        players.add(new Top4.TestFilter.Player("Alice", 1200));
        players.add(new Top4.TestFilter.Player("Bob", 1500));
        players.add(new Player("Eve", 900));

        List<Player> sortedList = players.stream().sorted(Comparator.comparingInt(Player::getPoints).reversed()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
