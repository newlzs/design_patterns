package templet;

/**
 * @author Lzs
 * @date 2021/11/5 15:40
 * @description
 */
public class DiaryDataService extends DataService{
    @Override
    public String filter(String data) {
        System.out.println("过滤日记敏感词");
        return data + "过滤 ";
    }

    @Override
    public String encrypt(String data) {
        System.out.println("加密日记信息");
        return data + "加密 ";
    }

    @Override
    public void save(String data) {
        System.out.println("日记信息持久化");
    }
}