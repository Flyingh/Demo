import java.util.function.Consumer;

/**
 * Created by zhujk on 14-3-31.
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Person> consumer=p->System.out.println(p.getName());
        PersonFactory<Person> personFactory=Person::new;
        consumer.accept(personFactory.create("Bloch",45));
    }
}
