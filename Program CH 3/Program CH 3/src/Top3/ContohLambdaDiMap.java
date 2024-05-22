package Top3;

import java.util.HashMap;
import java.util.Map;

public class ContohLambdaDiMap {
    public static void main(String[] args) {
        Map<Integer, String> pair = new HashMap();
        pair.put(1, "abc");
        pair.put(2, "def");
        for (Map.Entry<Integer, String> entry : pair.entrySet()){
            System.out.println( entry.getKey() + " : " + entry.getValue());
        }

        pair.forEach((key, value) ->System.out.println(key + " : " + value)) ;
    }
}
