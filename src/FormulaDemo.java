/**
 * Created by zhujk on 14-3-31.
 */
public class FormulaDemo {
    public static void main(String[] args) {
        Formula formula=n->n*100;
        System.out.println(formula.calculate(100));
    }
}
