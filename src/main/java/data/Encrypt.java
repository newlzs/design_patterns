package data;

/**
 * @author Lzs
 * @date 2021/10/27 20:25
 * @description
 */
public class Encrypt extends Finery {
    @Override
    public String saveData(String s) {
        String pre = super.saveData(s);
        System.out.println("执行加密");
        // ....
        return pre + "  这是加密后的数据";
    }
}