/**
 * Created by zhujk on 14-3-31.
 */
@FunctionalInterface
public interface Convertor<F,T> {
    T convert(F from);
}
