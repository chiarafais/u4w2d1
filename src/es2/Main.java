package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km che hai percorso");
            double km = Double.parseDouble((scanner.nextLine()));

            System.out.println("Inserisci i litri di carburante che hai consumato in " + km + " km");
            double litri = Double.parseDouble((scanner.nextLine()));
            if (litri == 0){
                throw new ArithmeticException("impossibile dividere per 0");
            }

            //calcolo per ottenere la divisione kilometro - litro
            double result = km / litri;

            System.out.println("Hai consumato " + result + " km/lt");

        } catch (NumberFormatException ex) {
            System.out.println("Non hai inserito un numero o un valore corretto");

        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.out.println("Non è possibile dividere per zero");

    }


        scanner.close();
    }

}

