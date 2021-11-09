package progInt.lab2.part2;

import java.util.Scanner;

public class Main extends ShowRepositoryImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShowRepositoryImpl showRepository = new ShowRepositoryImpl();

        Show[] shows = new Show[2];
        shows[0] = new Show("Лебединое озеро", 10, 0, 0);
        shows[1] = new Show("Балет", 100, 0, 0);

        for (int i = 0; i < shows.length; i++) {
            showRepository.putShow(shows[i]);
        }

        for (int i = 0; i < shows.length; i++) {

            showRepository.repositoryInfo();

            System.out.println("Спектакль: " + shows[i].getName());
            System.out.println("________________________________________________________");
            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));

            System.out.print("Введите кол-во билетов к продаже: ");
            int saleCount = scanner.nextInt();
            System.out.println(showRepository.saleTickets(shows[i].getName(), saleCount));
            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));

            System.out.print("Введите кол-во билетов к бронированию: ");
            int bookingCount = scanner.nextInt();
            System.out.println(showRepository.bookingTickets(shows[i].getName(), bookingCount));
            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));

            System.out.print("Введите кол-во билетов к возврату: ");
            int refundCount = scanner.nextInt();
            System.out.println(showRepository.refundTickets(shows[i].getName(), refundCount));
            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));

            System.out.print("Введите кол-во билетов к отмене брони: ");
            int removingBookingCount = scanner.nextInt();
            System.out.println(showRepository.removingBookingTickets(shows[i].getName(), removingBookingCount));
            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));

            System.out.print("Введите кол-во билетов к продаже брони: ");
            int saleBookingCount = scanner.nextInt();
            System.out.println(showRepository.saleBookingTickets(shows[i].getName(), saleBookingCount));

            System.out.println(showRepository.getTicketsInfo(shows[i].getName()));
            System.out.println("________________________________________________________");
        }

        System.out.println(test());
    }

    public static String test(){
        ShowRepositoryImpl showRepository = new ShowRepositoryImpl();
        return showRepository.getTicketsInfo("123");
    }
}
