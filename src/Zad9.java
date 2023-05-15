import java.util.Scanner;

public class Zad9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean kontynuuj = true;

        do {
            System.out.print("Wprowadź pierwszą liczbę: ");

            int liczba1 = scanner.nextInt();

            System.out.print("Wprowadź drugą liczbę: ");

            int liczba2 = scanner.nextInt();

            int suma = liczba1 + liczba2;

            System.out.println("Suma: " + suma);

            System.out.print("Czy chcesz ponownie wykonać operację? (Tak/Nie): ");

            String odpowiedz = scanner.next();

            if (odpowiedz.equalsIgnoreCase("Nie")) {

                kontynuuj = false;

            }

        } while (kontynuuj);

        System.out.println("Koniec programu.");
    }
}
