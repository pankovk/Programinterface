package progInt.lab2.part2;

import java.util.HashMap;
import java.util.Map;

public class ShowRepositoryImpl implements ShowRepository {
    HashMap<String, Show> hashMap = new HashMap<>();

    public void repositoryInfo() {
        for (Map.Entry<String, Show> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": Осталось - " + entry.getValue().getTickets() + ", Продано - " + entry.getValue().getSaleTickets() + ", забронировали - " + entry.getValue().getBookingTickets());
        }
    }

    public boolean checkShow(String showName) {
        return hashMap.containsKey(showName);
    }

    public void putShow(Show show) {
        if (hashMap.containsKey(show.getName())) {
            Show value = hashMap.get(show.getName());
            hashMap.put(
                    show.getName(),
                    new Show(
                            show.getName(),
                            value.getTickets() + show.getTickets(),
                            value.getSaleTickets(),
                            value.getBookingTickets()
                    )
            );
        } else
            hashMap.put(show.getName(), show);
    }

    @Override
    public String saleTickets(String showName, int count) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            if (value.getTickets() >= count) {
                value.setTickets(value.getTickets() - count);
                value.setSaleTickets(value.getSaleTickets() + count);
                hashMap.put(showName, value);
                return "Покупка";
            } else
                return "Осталось только " + value.getTickets() + " билетов";
        } else return "Нет такого события";
    }

    @Override
    public String refundTickets(String showName, int count) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            if (value.getSaleTickets() >= count) {
                value.setTickets(value.getTickets() + count);
                value.setSaleTickets(value.getSaleTickets() - count);
                return "Возврат";
            } else
                return "Нельзя вернуть билетов больше чем их продано";
        } else return "Нет такого события";
    }

    @Override
    public String bookingTickets(String showName, int count) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            if (value.getTickets() >= count) {
                value.setTickets(value.getTickets() - count);
                value.setBookingTickets(value.getBookingTickets() + count);
                hashMap.put(showName, value);
                return "Бронь";
            } else
                return "Осталось только " + value.getTickets() + " билетов";
        } else return "Нет такого события";
    }

    @Override
    public String removingBookingTickets(String showName, int count) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            if (value.getBookingTickets() >= count) {
                value.setTickets(value.getTickets() + count);
                value.setBookingTickets(value.getBookingTickets() - count);
                hashMap.put(showName, value);
                return "Отмена брони";
            } else
                return "Забронированно меньше чем вы пытаетесь вернуть";
        } else return "Нет такого события";
    }

    @Override
    public String saleBookingTickets(String showName, int count) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            if (value.getBookingTickets() >= count) {
                value.setTickets(value.getTickets() - count);
                value.setBookingTickets(value.getBookingTickets() - count);
                value.setSaleTickets(value.getSaleTickets() + count);
                hashMap.put(showName, value);
                return "Выкуп брони";
            } else
                return "Нельзя выкупить билетов больше чем их забронированно";
        } else return "Нет такого события";
    }

    @Override
    public String getTicketsInfo(String showName) {
        if (checkShow(showName)) {
            Show value = hashMap.get(showName);
            return "Билетов в продаже: " + value.getTickets() + ", продано билетов: " + value.getSaleTickets() + " забронированно билетов: " + value.getBookingTickets();
        } else return "Нет такого события";
    }
}
