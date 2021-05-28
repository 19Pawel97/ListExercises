import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    // Stwórz listę Integerów. Wykonaj zadania:
    //- dodaj do listy 5 elementów ze scannera
    //- dodaj do listy 5 elementów losowych
    //- wypisz elementy
    // Sprawdź działanie aplikacji

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integers.add(i, scanner.nextInt());
        }

        for (int i = 5; i < 10; i++) {
            integers.add(i, ((int) (Math.random() * 1000)));
        }

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

    }
}
