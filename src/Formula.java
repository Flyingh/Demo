/**
 * Created by zhujk on 14-3-31.
 */
public interface Formula {
    double calculate(int n);

    default double sqrt(int n) {
        return Math.sqrt(n);
    }
}



