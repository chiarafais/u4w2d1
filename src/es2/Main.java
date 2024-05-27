package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km che hai percorso");
            int km = Integer.parseInt(scanner.nextLine());

            System.out.println("Inserisci i litri di carburante che hai consumato in " + km + "km");
            int litri = Integer.parseInt(scanner.nextLine());

            //calcolo per ottenere la divisione kilometro - litro
            int result = km / litri;

            System.out.println("Hai consumato " + result + " km/lt");

        } catch (ArithmeticException err) {
            System.out.println("Non è possibile dividere per zero");

        } catch (NumberFormatException err) {
            System.out.println("Non hai inserito un numero o un valore corretto");
        }

        scanner.close();
    }

}

