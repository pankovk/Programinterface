package progIntM.lab1.part3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Мссив Xn");
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * (10 + 10)) - 10;
            System.out.println("X[" + i + "]: " + x[i]);
        }

        System.out.println("Массив Yn");
        for (int i = 0; i < y.length; i++) {
            y[i] = (int) (Math.random() * (10 + 10)) - 10;
            System.out.println("Y[" + i + "]: " + y[i]);
        }
        double[] z = onArray(x, y);

        if (z.length > 0)
            System.out.println("Сформированный массив Zn");
        else System.out.println("Массив пуст");
        for (int i = 0; i < z.length; i++) {
            System.out.println("Z[" + i + "]: " + z[i]);
        }
    }

    static double[] onArray(double[] x, double[] y) {
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0 && i % 2 != 0) {
                k++;
            }
            if (y[i] < 0 && i % 2 == 0) {
                k++;
            }
        }
        double[] z = new double[k];
        if (k > 1) {
            k = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] > 0 && i % 2 != 0) {
                    z[k] = x[i];
                    k++;
                }
                if (y[i] < 0 && i % 2 == 0) {
                    z[k] = y[i];
                    k++;
                }
            }
        }
        return z;
    }
}
