package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Podaj liczbę wierszy - maksymalna wartość 100");
            x = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn - maksymalna wartość 100");
            y = scanner.nextInt();

        } while (x > 100 || y > 100);

        int[][] tab = new int[x][y];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
                System.out.printf("%6d %s", tab[i][j], "|");
            }
            System.out.printf("%n");
            if (i < tab.length - 1) {
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.printf("%s", "--------");
                }
                System.out.printf("%n");
            }
        }
    }
}



