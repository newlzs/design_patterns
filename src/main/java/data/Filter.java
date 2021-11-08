package data;

/**
 * @author Lzs
 * @date 2021/10/27 20:26
 * @description
 */
public class Filter extends Finery {
    @Override
    public String saveData(String s) {
        String pre = super.saveData(s);
        System.out.println("执行过滤");
        // ...
        return pre + "  这是过滤后的数据";
    }
}