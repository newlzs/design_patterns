package data;

/**
 * @author Lzs
 * @date 2021/10/27 20:28
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Finery filter = new Filter();
        Finery encrypt = new Encrypt();

        filter.decorator(data);
        encrypt.decorator(filter);

        Data beautifulData = encrypt;

        System.out.println(beautifulData.saveData("原始数据"));
    }
}