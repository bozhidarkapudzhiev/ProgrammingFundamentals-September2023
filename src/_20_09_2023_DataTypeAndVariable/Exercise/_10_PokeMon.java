package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N -> силата на мушкане, която Poke Mon има, N  - цяло число
        int pokePower = Integer.parseInt(scanner.nextLine());
        int originalPokePower = pokePower;

        // M -> разстоянието между целите на мушкането, M – цяло число
        int pokeDistance = Integer.parseInt(scanner.nextLine());

        // изчерпванетоФактор Y – цяло число
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (pokePower >= pokeDistance) {
            pokePower -= pokeDistance;
            count++;

            // Проверка за изчерпване на мощността (ако мощността е точно 50% от оригиналната)
            if (pokePower == originalPokePower / 2 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(count);
    }
}