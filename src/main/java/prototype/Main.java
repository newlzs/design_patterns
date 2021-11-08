package prototype;

/**
 * @author Lzs
 * @date 2021/11/3 22:30
 * @description
 */
public class Main {
    public static void main(String[] args) throws Exception {
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setContent("c1");
        weeklyLog.setDate("1.1");
        weeklyLog.setName("lizishi");
        Attachment attachment = new Attachment();
        attachment.setId(1);
        attachment.setName("证件照.jpg");
        weeklyLog.setAttachment(attachment);

        System.out.println("// 浅拷贝");
        WeeklyLog weeklyLogClone = weeklyLog.clone();
        System.out.println(weeklyLog + "   " + weeklyLog.getAttachment());
        System.out.println(weeklyLogClone + "   " + weeklyLogClone.getAttachment());

        System.out.println("// 深拷贝");
        WeeklyLog weeklyLogDeepClone = weeklyLog.deepClone();
        System.out.println(weeklyLog + "   " + weeklyLog.getAttachment());
        System.out.println(weeklyLogDeepClone + "   " + weeklyLogDeepClone.getAttachment());
    }
}