import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Karthik", 90);
        map.put("Rahil", 80);
        int ans = map.getOrDefault("Surya",0);
        System.out.println(ans);

        map.putIfAbsent("Karthik", 99);
        map.putIfAbsent("lav",34);
        System.out.println(map);

        Map<String, List<String>> map2 = new HashMap<>();
        map2.computeIfAbsent("IT", key -> new ArrayList<>()).add("Karthik");
        map2.computeIfAbsent("IT", key -> new ArrayList<>()).add("Surya");
        map2.computeIfAbsent("HR", key -> new ArrayList<>()).add("Rahul");
        System.out.println(map2);

        String[] arr = {"A", "B", "A", "C", "B", "A"};

        Map<String, Integer> map3 = new HashMap<>();

        for (String s : arr) {
            map3.merge(s, 1, Integer::sum);
        }

        System.out.println(map3);

    }
}
