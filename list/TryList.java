package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TryList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(-234);
        list.add(90);
        list.add(66);
        list.add(5);
        list.add(24);

        for (Integer numb : list) System.out.println(numb);

        System.out.println("------------------------------------------------");

        list.remove(1);
        for (Integer numb : list) System.out.println(numb);

        System.out.println("------------------------------------------------");

        list.removeIf(x -> x % 2 != 0);
        for (Integer numb : list) System.out.println(numb);

        System.out.println("------------------------------------------------");

        List<Integer> number = list.stream().filter(x -> x % 3 == 0).toList();
        for (Integer numb : number) System.out.println(numb);
    }
}
