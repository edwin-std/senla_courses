package senla.tasks.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mnozhitely {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число которое нужно разбить на множители.");
        int n = 0;
        try {
             n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введённое число не целое.");
            return;
        }
        int b = 2;
        while (n != 1) {
            if (n % b == 0) {
                System.out.print(b + " ");
                n /= b;
            } else {
                b++;
            }
        }
    }
}
