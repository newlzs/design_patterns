package factory;

/**
 * @author Lzs
 * @date 2021/10/31 20:32
 * @description
 */
public class SubOperation implements Operation {
    public int getResult(int a, int b) {
        return a - b;
    }
}