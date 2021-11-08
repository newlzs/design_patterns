package proxy;

/**
 * @author Lzs
 * @date 2021/10/31 16:24
 * @description
 */
public class OfficialTicketService implements TicketService {
    public void sell() {
        System.out.println("官方：买了一张票");
    }

    public void cancel() {
        System.out.println("官方：退了一张票");
    }
}