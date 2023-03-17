import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {


    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }


    public static void printEvenNumbers(Collection<Integer> integerList) {
        //Метод принимает на вход список целых чисел, определяет в списке количество четных чисел и выводит их в консоль.
        List<Integer> evenInt = integerList.stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Количество четных чисел в списке: " + evenInt.size());
        System.out.println(evenInt);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 9, 4);
        Stream stream = integerList.stream();

        //Реализация метода из задачи 1.
        findMinMax(
                stream,
                Integer::compareTo,
                (min, max) -> System.out.println("min: " + min + ", max: " + max)
        );

        //Реализация метода из задачи 2.
        printEvenNumbers(integerList);


    }
}