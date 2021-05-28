import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    // Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
    //- dodaj do listy 10 liczb losowych
    //- oblicz sumę elementów na liście (wypisz ją)
    //- oblicz średnią elementów na liście (wypisz ją)
    //- ​stwórz kopię listy i ją posortuj ​: (Collections.sort( listaDoPosortowania) - sortuje listę)
    //(przykład użycia Collections.sort(lista):
    //ArrayList<Integer> liczby = new ArrayList<>();
    //liczby.add(5);
    //liczby.add(10);
    //liczby.add(15);
    //Collections.sort(liczby);
    //- podaj medianę elementów na liście posortowanej (wypisz ją)
    //- znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
    //- po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
    //- po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
    //Sprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i, ((int) (Math.random() * 1000)));
        }

        Integer sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        System.out.println(sum);
        System.out.println((double) sum / 10);

        List<Integer> integersCopy = new ArrayList<>();
        integersCopy.addAll(integers);
        Collections.sort(integersCopy);
        for (Integer integer : integersCopy) {
            System.out.println(integer);
        }

        Double median = (Double.valueOf((integersCopy.get(4)) + Double.valueOf(integersCopy.get(5))) / 2);
        System.out.println(median);

        Integer min = integers.get(0);
        Integer max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }

        int indexOfMax = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == max) {
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
        System.out.println(integers.indexOf(max));
    }
}
