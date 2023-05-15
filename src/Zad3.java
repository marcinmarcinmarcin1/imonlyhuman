package petle;


import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Wpisz 'Tak' lub 'Nie': ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("Tak") && !input.equalsIgnoreCase("Nie")) {
                System.out.println("Niepoprawny tekst! Spróbuj ponownie.");
            }
        } while (!input.equalsIgnoreCase("Tak") && !input.equalsIgnoreCase("Nie"));

        System.out.println("Wprowadzono poprawny tekst: " + input);
    }
}