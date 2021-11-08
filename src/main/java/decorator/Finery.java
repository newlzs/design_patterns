package decorator;

/**
 * @author Lzs
 * @date 2021/10/25 21:57
 * @description
 */
public class Finery extends Person {
    protected Person component;

    public void decorator(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}