package co.com.poli.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Primer");
        list.add("");
        list.add("Elemento");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList =  filterList(list, predicate);

        System.out.println(newList);

    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();

        for (String string : list){
            if (predicate.test(string)){
                newList.add(string);
            }
        }
        return newList;
    }
}
