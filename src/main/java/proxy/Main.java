package proxy;

/**
 * @author Lzs
 * @date 2021/10/31 16:29
 * @description
 */
public class Main {
    public static void main(String[] args) {
        OfficialTicketService officialTicketService = new OfficialTicketService();
        XieChengTicketService xieChengTicketService = new XieChengTicketService(officialTicketService);

        xieChengTicketService.sell();

        xieChengTicketService.cancel();

        xieChengTicketService.buyOthers();
    }
}