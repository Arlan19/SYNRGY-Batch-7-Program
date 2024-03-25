package Top3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDenganIteratorExample {
    public static void main(String[] args) {
        Map<String, String> mapCountryCode = new HashMap<>();
        mapCountryCode.put("1", "USA");
        mapCountryCode.put("44", "UK");
        mapCountryCode.put("33", "FRANCE");
        mapCountryCode.put("81", "JAPAN");

        Set<String> setCodes = mapCountryCode.keySet();
        Iterator<String> iterator = setCodes.iterator();

        while (iterator.hasNext()){
            String code = iterator.next();
            String country = mapCountryCode.get(code);

            System.out.println(code + " => " + country);
        }

    }
}
