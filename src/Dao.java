/**
 * Created by zhujk on 14-3-31.
 */
@FunctionalInterface
public interface Dao {
    void add(String name);

    default void delete(String name){

    }
}
