package proxy;

import com.sun.media.sound.SoftFilter;

/**
 * @author Lzs
 * @date 2021/10/31 16:26
 * @description
 */
public class XieChengTicketService implements TicketService {
    private OfficialTicketService officialTicketService;

    public XieChengTicketService(OfficialTicketService officialTicketService) {
        this.officialTicketService = officialTicketService;
    }

    public void sell() {
        officialTicketService.sell();
        System.out.println("携程：你买了一张票");
    }

    public void cancel() {
        officialTicketService.cancel();
        System.out.println("携程：你退了一张票");
    }

    public void buyOthers() {
        System.out.println("携程：你还可以买别的东西");
    }
}