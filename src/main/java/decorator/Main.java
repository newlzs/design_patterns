package decorator;

/**
 * @author Lzs
 * @date 2021/10/25 22:04
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Person tom = new Person("汤姆");

        TShirts ts = new TShirts();
        BigTrouser bt = new BigTrouser();

        ts.decorator(tom);
        bt.decorator(ts);

        Person result = bt;
        result.show();
    }
}