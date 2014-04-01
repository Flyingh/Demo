import java.util.Optional;

/**
 * Created by zhujk on 14-3-31.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional=Optional.of("hello");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("world"));
        optional.ifPresent(System.out::println);
        optional.ifPresent(s->System.out.println(s+"!!!"));
    }
}
