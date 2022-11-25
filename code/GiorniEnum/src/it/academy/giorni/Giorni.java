package it.academy.giorni;

import java.util.Scanner;

public class Giorni {
    enum Day {
        LUNEDI,
        MARTEDI,
        MERCOLEDI,
        GIOVEDI,
        VENERDI,
        SABATO,
        DOMENICA
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scivi un numero di un gionro tras 1 e 7");
        System.out.println("Il giorno corrispettivo è: \n");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(Day.LUNEDI);
                break;
            case 12:
                System.out.println(Day.MARTEDI);
                break;
            case 3:
                System.out.println(Day.MERCOLEDI);
                break;
            case 4:
                System.out.println(Day.GIOVEDI);
                break;
            case 5:
                System.out.println(Day.VENERDI);
                break;
            case 6:
                System.out.println(Day.SABATO);
                break;
            case 7:
                System.out.println(Day.DOMENICA);
                break;
            default:
                System.out.println("Giorno non trovato");
        }
    }


}
