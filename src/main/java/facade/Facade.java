package facade;

/**
 * @author Lzs
 * @date 2021/11/5 21:55
 * @description
 */
public class Facade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
    }
    // 外观模式，外界可以看到的，屏蔽了细节
    public void m1() {
        System.out.println("方法组1");
        subSystem2.m();
        subSystem1.m();
    }
}