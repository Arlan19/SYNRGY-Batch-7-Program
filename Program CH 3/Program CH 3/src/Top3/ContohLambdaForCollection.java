package Top3;

import java.util.Arrays;
import java.util.List;

public class ContohLambdaForCollection {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abc", "def");
//      tampa lambda
        for (String word : words){
            System.out.println(word);
        }
        System.out.println("Dengan Lambda");
//        dengan lambda
        words.forEach(word -> System.out.println(word));
        System.out.println("Dengan Method Reference");
//        dengan method reference
        words.forEach(System.out::println);

    }
}
