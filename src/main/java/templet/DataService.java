package templet;

/**
 * @author Lzs
 * @date 2021/11/5 15:35
 * @description
 */
public abstract class DataService {

    public void saveData(String data) {
        String filteredData = filter(data);
        String saveData = encrypt(filteredData);
        save(data);
    }

    public abstract String filter(String data);

    public abstract String encrypt(String data);

    public abstract void save(String data);
}