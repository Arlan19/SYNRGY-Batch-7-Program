package Top4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileLooping {
    public static void main(String[] args) {
        boolean result = Show();
        if (result){
            System.out.println("Loop Exit explicity");
        }else {
            System.out.println("Loop not Exxit explicity");
        }
    }

    static boolean Show() {
        List<Integer> list = Arrays.asList(new Integer[]{12, 34, 21, 33, 22, 55});
        int i = 0;
        while (i <list.size()){
            if (i == 3){
                return true;
            }
            System.out.println(list.get(i));
            i++;
        }
        return false;
    }
}
