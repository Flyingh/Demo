import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by zhujk on 14-4-1.
 */
@Repeatable(Hints.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hint {
    String value();
}
