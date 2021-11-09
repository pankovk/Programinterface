package progInt.lab1.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        double[] x = new double[n];

        System.out.print("Введите интервал \nA: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();

        System.out.println("Введите массив");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextDouble();
        }

        System.out.println("Кол-во элементов попадающих в интервал: " + onArray(A, B,x));
    }
    static int onArray(int A, int B, double[] x){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= A && x[i] <= B)
                count++;
        }
        return count;
    }
}
