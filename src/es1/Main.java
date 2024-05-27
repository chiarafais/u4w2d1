package es1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            int[] numArray = new int[5];
            for (int i = 0; i < numArray.length; i++) {
                Random randomNum = new Random();
                int num = randomNum.nextInt(1,10);
                numArray[i] = num;
            }
             System.out.println(Arrays.toString(numArray));

            int num = 1;

        Scanner scanner = new Scanner(System.in);

        while(num !=0) {
            try{
                System.out.println("Inserisci un numero da 1 a 10 (inserisci 0 se invece vuoi interrompere)");
                num = scanner.nextInt();
                if (num == 0){
                    System.out.println("chiusura in corso");
                    scanner.close();
                }  else if (num <= 10){
                    System.out.println("In quale posizione, da 1 a 5, vuoi inserire il numero scelto?");
                    int posizione = scanner.nextInt();
                    if(posizione > 0 && posizione <= 5){
                        numArray[posizione -1] = num;
                    }else{
                        System.out.println("Errore, il numero deve essere tra 1 e 5");
                    }

                    System.out.println( "Il tuo array modificato: " + Arrays.toString(numArray));
                }

            } catch (InputMismatchException | NumberFormatException err) {
                System.out.println("Inserisci un numero!");
            }
        }
        scanner.close();

    }









}
