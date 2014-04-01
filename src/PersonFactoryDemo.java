/**
 * Created by zhujk on 14-3-31.
 */
public class PersonFactoryDemo {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("flycoding", 26);
        System.out.println(person.getName()+"----->"+person.getAge());
    }


    private static void newDemo() {
        PersonFactory<Person> personFactory = (name, age) -> new Person(name, age);
        Person person = personFactory.create("flyingh", 26);
        System.out.println(person.getName() + "-->" + person.getAge());
    }
}
