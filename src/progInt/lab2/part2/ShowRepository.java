package progInt.lab2.part2;

public interface ShowRepository {

    void putShow (Show show);

    String saleTickets(String showName, int count);

    String refundTickets(String showName, int count);

    String bookingTickets(String showName, int count);

    String removingBookingTickets(String showName, int count);

    String saleBookingTickets(String showName, int count);

    String getTicketsInfo(String showName);
}
