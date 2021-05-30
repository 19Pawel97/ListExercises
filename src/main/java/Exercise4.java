import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Exercise4 {

    // Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
    //- dodaj do listy losowe 100 elementów z zakresu 0-100. (​konwersja int na string to
    //String.valueOf())
    //- oblicz średnią liczb
    //- usuń wszystkie liczby powyżej średniej
    //- wypisz wszystkie liczby
    //- wykonaj kopię listy do tablicy
    //Sprawdź działanie aplikacji
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int element = random.nextInt(101);
            stringList.add(String.valueOf(element));
        }

        int sum = 0;
        for (String s : stringList) {
            sum += Integer.parseInt(s);
        }
        double average = sum / (double) stringList.size();
        System.out.println(sum);
        System.out.println(average);

        for (Iterator<String> it = stringList.iterator(); it.hasNext(); ) {
            String next = it.next();
            if (Integer.parseInt(next) > average)
                it.remove();
        }

        for (String s : stringList) {
            System.out.print(s + " ");
        }
        System.out.println();

        String[] stringArray = new String[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            stringArray[i] = stringList.get(i);
        }

        for (String s : stringArray) {
            System.out.print(s + " ");
        }

    }
}
