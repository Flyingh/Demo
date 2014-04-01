import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by zhujk on 14-4-1.
 */
//@Hints({@Hint("a"),@Hint("b")})
@Hint("hello")
@Hint("world")
public class User {
    public static void main(String[] args) {
        Hint hint = User.class.getAnnotation(Hint.class);
        System.out.println(hint);
        Hints hints = User.class.getAnnotation(Hints.class);
        System.out.println(hints.value().length);
        Hint[] hints1 = User.class.getAnnotationsByType(Hint.class);
        for (Hint hint1 : hints1) {
            System.out.println(hint1.value());
        }
    }
}
