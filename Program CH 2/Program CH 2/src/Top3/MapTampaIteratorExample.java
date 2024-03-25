package Top3;

import java.util.HashMap;
import java.util.Map;

public class MapTampaIteratorExample {
    public static void main(String[] args) {
        Map<Integer, String> mapHttpErrors = new HashMap<>();
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");

        for (Integer i : mapHttpErrors.keySet()){
            System.out.println(mapHttpErrors.get(i));
        }
    }
}
