import java.util.Base64;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");

        String message = scanner.nextLine();

        byte[] decodedBytes = Base64.getDecoder().decode(message);

        System.out.println(new String(decodedBytes));
    }
}
