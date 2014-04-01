import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by zhujk on 14-3-31.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> notEmpty=s->s.length()>0;
        System.out.println(notEmpty.test("abc"));
        System.out.println(notEmpty.negate().test("abc"));

        Predicate<Object> nonNull= Objects::nonNull;
        Predicate<Boolean> isNull=Objects::isNull;
        System.out.println(nonNull.test(null));
        System.out.println(isNull.test(null));

        Predicate<String> isEmpty=String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test(" "));
        System.out.println(isEmpty.test("abc"));
    }

}
