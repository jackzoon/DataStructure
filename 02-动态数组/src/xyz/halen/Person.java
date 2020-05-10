package xyz.halen;

/**
 * Created By Halen 2020/5/10 9:36
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*@Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.age == person.age;
    }*/

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Person - finalize");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
