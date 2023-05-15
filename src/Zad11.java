import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            suma += liczba;
        }

        System.out.println("Suma wprowadzonych liczb: " + suma);
    }
}