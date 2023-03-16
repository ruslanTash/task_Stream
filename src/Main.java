import java.util.*;
import java.util.stream.Collectors;


public class Main {
//    public static void findMinMax(Stream <? extends T> stream,
//                                  Comparator <? super T> order,
//                                  BiConsumer <? super T, ? super T> minMaxConsumer){
//    //находить в стриме минимальный и максимальный элементы в соответствии с порядком, заданным Comparator'ом
//        minMaxConsumer.accept(min, max);
//        minMaxConsumer.accept(null, null);
//    }


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

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 9, 4, null);
        printEvenNumbers(integerList);


    }
}