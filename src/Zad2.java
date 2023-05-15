package petle;


import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Wpisz literę 'T', 't', 'N' lub 'n': ");
            input = scanner.nextLine().toUpperCase();

            if (!input.equals("T") && !input.equals("N")) {
                System.out.println("Niepoprawna litera! Spróbuj ponownie.");
            }
        } while (!input.equals("T") && !input.equals("N"));

        System.out.println("Wprowadzono poprawną literę: " + input);
    }
}
