/**
 * Created by zhujk on 14-3-31.
 */
public class FormulaImpl implements Formula {
    @Override
    public double calculate(int n) {
        return sqrt(n * 100);
    }
}
