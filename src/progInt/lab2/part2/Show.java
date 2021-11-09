package progInt.lab2.part2;

public class Show {
    private String name;
    private int tickets;
    private int saleTickets;
    private int bookingTickets;

    public Show(){
    }

    public Show(String name, int tickets, int saleTickets, int bookingTickets) {
        this.name = name;
        this.tickets = tickets;
        this.saleTickets = saleTickets;
        this.bookingTickets = bookingTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTickets() {
        return tickets;
    }

    public int getSaleTickets() {
        return saleTickets;
    }

    public int getBookingTickets() {
        return bookingTickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public void setSaleTickets(int saleTickets) {
        this.saleTickets = saleTickets;
    }

    public void setBookingTickets(int bookingTickets) {
        this.bookingTickets = bookingTickets;
    }
}
