import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Java","Spring"));
        List<String> names2 = Collections.unmodifiableList(names);
//        names2.add("react");

        names.add("angular");

        System.out.println(names);
        System.out.println(names2);
    }
}
