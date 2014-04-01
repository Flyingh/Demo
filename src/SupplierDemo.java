import java.util.function.Supplier;

/**
 * Created by zhujk on 14-3-31.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Person> supplier=Person::new;
        System.out.println(supplier.get());
    }
}
