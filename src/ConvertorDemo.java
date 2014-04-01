/**
 * Created by zhujk on 14-3-31.
 */
class LambdaDemo{
    static int outerStaticNumber;
    int instanceNumber;

    void testScope(){
        Convertor<Integer,String> convertor1=(from)->{
            instanceNumber=18;
            return String.valueOf(instanceNumber);
        };
        Convertor<Integer,String> convertor2=from->{
            outerStaticNumber=100;
            return String.valueOf(outerStaticNumber);
        };
        System.out.println(convertor1.convert(123));
        System.out.println(convertor2.convert(123));
    }

}
public class ConvertorDemo {
    public static void main(String[] args) {
        LambdaDemo demo=new LambdaDemo();
        demo.testScope();
    }

    private static void convert5() {
        int num = 3;
        Convertor<Integer, String> convertor = from -> String.valueOf(from + num);
        System.out.println(convertor.convert(5));
//        num=5;
    }

    private static void convert4() {
        String num = "_Java";
        Convertor<String, String> convertor = from -> String.valueOf(from + num);
        System.out.println(convertor.convert("Hello World"));
    }

    private static void convert3() {
        Something something = new Something();
        Convertor<String, String> convertor = something::startsWith;
        System.out.println(convertor.convert("abc"));
    }

    static class Something {
        public String startsWith(String str) {
            return String.valueOf(str.charAt(0));
        }
    }

    private static void convert2() {
        Convertor<String, Integer> convertor = Integer::valueOf;
        System.out.println(convertor.convert("654321"));
    }


    private static void convert1() {
        Convertor<String, Integer> convertor = from -> Integer.valueOf(from);
        System.out.println(convertor.convert("123456"));
    }
}
