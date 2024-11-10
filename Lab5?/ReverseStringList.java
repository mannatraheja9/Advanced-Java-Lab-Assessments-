import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C#");
        stringList.add("Ruby");
        stringList.add("PHP");

        System.out.println("List before reversal: " + stringList);

        Collections.reverse(stringList);

        System.out.println("List after reversal: " + stringList);
    }
}
