package decorator;

/**
 * @author Lzs
 * @date 2021/10/25 21:55
 * @description
 */
public class Person {
    public Person(){}

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "的装扮");
    }
}