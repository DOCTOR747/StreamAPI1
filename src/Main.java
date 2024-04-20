import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> lastlist = new ArrayList<Integer>();
        for (int i : intList) {
            if ((i > 0) & (i % 2 == 0)) {
                lastlist.add(i);
            }
            Collections.sort(lastlist);
        }
        System.out.println(lastlist);
    }
}