package xyz.halen;

/**
 * Created By Halen 2020/5/9 17:00
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(10, "Jack"));
        persons.add(null);
        persons.add(new Person(15, "Halen"));
        persons.add(new Person(18, "Rose"));
        System.out.println(persons.indexOf(null));
        System.out.println(persons);
        persons.clear();
        // 提醒JVM进行垃圾回收
        System.gc();
    }

    public static void test() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(10, "Jack"));
        persons.add(new Person(15, "Halen"));
        persons.add(new Person(18, "Rose"));

        System.out.println(persons);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        System.out.println(ints);
    }
}
