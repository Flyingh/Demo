import java.util.Comparator;

/**
 * Created by zhujk on 14-3-31.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Person p1=new Person("hello",20);
        Person p2=new Person("hehe",22);
        System.out.println(comparator.compare(p1,p2));
        System.out.println(comparator.reversed().compare(p1,p2));
    }
}
