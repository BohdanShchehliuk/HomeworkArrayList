package Main;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Integer> listOne = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOne.add(i, (int) (Math.random() * 100));
        }
        System.out.println("Масив 1" + listOne);
        ListIterator<Integer> iterator = listOne.listIterator();

        while (iterator.hasNext()) {
            listOne.set(iterator.nextIndex(), (iterator.next() + 1));
        }
        System.out.println("Масив 2" + listOne);
    }
}

