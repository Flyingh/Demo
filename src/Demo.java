import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zhujk on 14-3-31.
 */
public class Demo {
    public static void main(String[] args) {

    }

    private static void compare2() {
        List<String> strs = Arrays.asList("b", "c", "a");
        System.out.println(strs);
        Collections.sort(strs, (s1, s2) -> s1.compareTo(s2));
        System.out.println(strs);
    }

    private static void compare1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println(names);
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("***********");
        System.out.println(names);
    }

    private static void test1() {
        FormulaImpl formula = new FormulaImpl();
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(100));
    }


}
