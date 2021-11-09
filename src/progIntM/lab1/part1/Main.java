package progIntM.lab1.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны");
        System.out.print("а = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();


        double c = Math.sqrt(a * a + b * b);

        System.out.printf("Длина диагонали = %.4f", c);
    }
}
