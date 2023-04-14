package foreach;

import java.util.Arrays;
import java.util.Collection;


public class ForEachTests {

    // Метод ForEach применяет указанный метод к каждому элементу стрима и заканчивает работу со стримом
    private static void testForEach() {
        System.out.println();
        System.out.println("For each start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Напечатать отладочную информацию по каждому элементу стрима
        System.out.print("forEach = ");
        collection.stream().map(String::toUpperCase).forEach((e) -> System.out.print(e + ",")); // напечатает forEach = A1,A2,A3,A1,
        System.out.println();

        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        list.stream().forEachOrdered((p) -> p.append("_new"));
        System.out.println("forEachOrdered = " + list); // напечатает forEachOrdered = [a1_new, a2_new, a3_new]
    }

    public static void main(String[] args)  throws Exception {
        testForEach();
    }
}
