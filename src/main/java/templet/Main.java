package templet;

import data.Data;

/**
 * @author Lzs
 * @date 2021/11/5 15:44
 * @description
 */
public class Main {
    public static void main(String[] args) {
        DataService dataService = new DiaryDataService();

        dataService.saveData("这是我的日记");
    }
}