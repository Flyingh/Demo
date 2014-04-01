import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by zhujk on 14-4-1.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Hints {
    Hint[] value();
}
