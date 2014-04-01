/**
 * Created by zhujk on 14-3-31.
 */
@FunctionalInterface
public interface PersonFactory<P extends  Person> {
    P create(String name,int age);
}
