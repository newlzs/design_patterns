package data;

/**
 * @author Lzs
 * @date 2021/10/27 20:21
 * @description
 */
public class Finery extends Data {
    private Data data;

    public void decorator(Data data) {
        this.data = data;
    }

    @Override
    public String saveData(String s) {
        if (data != null) {
            return data.saveData(s);
        }
        return s;
    }
}