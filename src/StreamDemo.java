import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/**
 * Created by zhujk on 14-3-31.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        for (int i = 0, max = 1000000; i < max; i++) {
            strs.add(UUID.randomUUID().toString());
        }
        test(strs, false);
        test(strs, true);
    }

    private static void test(List<String> strs, boolean isParallel) {
        long start = System.nanoTime();
        long count = 0;
        if (isParallel) {
            count = strs.parallelStream().sorted().count();
        } else {
            count = strs.stream().sorted().count();
        }
        System.out.println(count);
        long end = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(end - start));
    }


    private static void stream1() {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        Predicate<String> predicate = s -> s.startsWith("a");
        stringCollection.stream().filter(predicate).forEach(System.out::println);
        System.out.println("*************");
        stringCollection.stream().filter(predicate).sorted().forEach(System.out::println);
        System.out.println("********************");
        stringCollection.stream().forEach(System.out::println);
        System.out.println(stringCollection);
        System.out.println("########################");
        stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&");
        System.out.println(stringCollection.stream().anyMatch(predicate));
        System.out.println(stringCollection.stream().allMatch(predicate));
        System.out.println(stringCollection.stream().noneMatch(predicate));
        System.out.println(stringCollection.stream().filter(s -> s.endsWith("1")).count());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Optional<String> optional = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "_" + s2);
        optional.ifPresent(System.out::println);
    }
}
