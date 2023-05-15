import java.util.Scanner;

public class Zad8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 0;

        while (product < 100) {
            System.out.print("Wprowadź liczbę: ");
            int liczba = scanner.nextInt();
            product = liczba * 10;
        }

        System.out.println("Osiągnięto wynik większy lub równy 100: " + product);
    }
}