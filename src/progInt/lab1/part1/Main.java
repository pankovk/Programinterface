package progInt.lab1.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();


        double c = Math.sqrt(x * x + y * y);

        System.out.printf("Расстояние до точки = %.4f", c);
    }
}
