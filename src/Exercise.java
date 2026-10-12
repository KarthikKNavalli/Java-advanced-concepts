import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(40,10,50,20,30));

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        int freq = Collections.frequency(list, 40);
        System.out.println(max +" "+" " + min+ " "+ freq);


        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list,40);
        System.out.println(index);

    }
}
