import java.util.HashMap;

/**
 * Created by zhujk on 14-3-31.
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i,"value"+i);
        }
        map.forEach((i,s)->System.out.println(s));

        map.computeIfPresent(3,(num,value)->value+num);
        System.out.println(map.get(3));

        map.computeIfPresent(9,(num,value)->null);
        System.out.println(map.containsKey(9));

        map.computeIfAbsent(23,(num)->"number:"+num);
        System.out.println(map.get(23));

        map.computeIfAbsent(3,num->"hello world!");
        System.out.println(map.get(3));
        map.computeIfAbsent(99,num->"hello world!!!!!");
        System.out.println(map.get(99));

        map.computeIfAbsent(95,num->null);
        System.out.println(map.containsKey(95));

        System.out.println(map.get(3));

        map.remove(3,"value3");
        System.out.println(map.get(3));
        map.remove(3,"value33");
        System.out.println(map.get(3));

        System.out.println(map.getOrDefault(5,"default"));
        System.out.println(map.getOrDefault(100,"default"));

        System.out.println(map.get(9));
        map.merge(9,"value9",(oldValue,newValue)->oldValue.concat(newValue));
        System.out.println(map.get(9));
        map.merge(9,"haha",(oldValue,newValue)->oldValue.concat(newValue));
        System.out.println(map.get(9));

    }

}
