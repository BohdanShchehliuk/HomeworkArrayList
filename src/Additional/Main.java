package Additional;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Олена Петрівна");
        list.add("Тетяна Володимирівна");
        list.add("Стефа Петрівна");
        list.add("Ірина Василівна");
        list.add("Ольга Володимирівна");
        System.out.println(list);
        System.out.println("THE BEST ONE IS " + (list.indexOf("Стефа Петрівна") + 1));
        System.out.println("THE WORST ONE IS " + (list.indexOf("Ольга Володимирівна") + 1));
    }
}
