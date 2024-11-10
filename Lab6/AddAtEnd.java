import java.util.HashSet;
import java.util.LinkedHashSet;

public class AddAtEnd {
    public static void main(String[] args) {
        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Diwali");
        hashSet.add("Holi");
        hashSet.add("Dussehra");

        System.out.println("Hashset before addition of new element: " + hashSet);

        String newElement = "Christmas";
        hashSet.add(newElement);

        System.out.println("Hashset after addition of new element: " + hashSet);
    }
}
