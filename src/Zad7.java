import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Wprowadź liczbę: ");
            int liczba = scanner.nextInt();
            suma += liczba;
        }

        System.out.println("Suma wprowadzonych liczb: " + suma);
    }
}
