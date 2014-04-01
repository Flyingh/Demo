import java.util.function.Function;

/**
 * Created by zhujk on 14-3-31.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function=Integer::valueOf;
        System.out.println(function.apply("12345"));
        System.out.println(function.andThen(String::valueOf).apply("54321"));
    }
}
