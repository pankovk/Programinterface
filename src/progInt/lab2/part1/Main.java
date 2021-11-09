package progInt.lab2.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House[] houses = new House[10];

        int flatCount = 0;
        int houseResident;
        boolean flag = false;

        houses[0] = new House("Железобетон", 12, "Энергострой", "Москва", new Type(12, "Дом 12"), 250, "2021.15.04");
        houses[1] = new House("Железобетон", 15, "Энергострой", "Омск", new Type( 11, "Дом 11"), 150, "2016.15.04");
        houses[2] = new House("Железобетон", 9, "Жилстрой", "Москва", new Type( 10, "Дом 10"), 210, "2015.15.04");
        houses[3] = new House("Кирпич", 2, "Дом под Ключ", "Тверь", new Type(121, "Дом 121"), 1, "2010.15.04");
        houses[4] = new House("Железобетон", 16, "ИмиджСтрой", "Москва",new Type( 3, "Дом 3"), 270, "2010.15.04");
        houses[5] = new House("Железобетон", 20, "ИмиджСтрой", "Москва", new Type( 4, "Дом 4"), 300, "2011.15.04");
        houses[6] = new House("Железобетон", 14, "НашДомСтрой", "Москва",new Type( 150, "Дом 150"), 240, "2009.15.04");
        houses[7] = new House("Железобетон", 15, "НашДомСтрой", "Москва",new Type( 160, "Дом 160"), 200, "2017.15.04");
        houses[8] = new House("Железобетон", 10, "Дом-Строй Инвест", "Москва",new Type( 29, "Дом 29"), 180, "2018.15.04");
        houses[9] = new House("Железобетон", 19, "Стройсервис", "Москва",new Type( 34, "Дом 34"), 290, "2008.15.04");

        System.out.print("Введите название компании застройщика: ");
        String developer = sc.nextLine();

        for (int i = 0; i < houses.length; i++) {
            if (Integer.parseInt(houses[i].getDate().substring(0, 4)) >= 2017)
                System.out.println(houses[i].toString());

            if (houses[i].getDeveloper().equalsIgnoreCase(developer)) {
                flatCount += houses[i].getFlatCount();
                flag = true;
            }
        }

        if (flag) {
            houseResident = flatCount * 3;

            System.out.println("Количество квартир заданного застройщика: " + flatCount + "\nКоличество жильцов: " + houseResident);
        } else
            System.out.println("Такой компании нет в списке - " + developer);

    }
}
