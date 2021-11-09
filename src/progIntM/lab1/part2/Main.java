package progIntM.lab1.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        double[] x = new double[n];

        System.out.println("Введите массив");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextDouble();
        }

        System.out.println("Кол-во элементов делящихся на 5 без остатка: " + onArray(x));
    }
    static int onArray(double[] x){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]%5==0)
                count++;
        }
        return count;
    }
}
