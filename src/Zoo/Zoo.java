package Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public ArrayList<String> zoo;

    public ArrayList<String> zooMethod() {
        String[] array = new String[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Введіть тварину №: " + (i + 1));
            Scanner input = new Scanner(System.in);
            array[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(array));

        ArrayList<String> zoo = new ArrayList<>(); // Новий метод!!!
        for (int i = 0; i < 8; i++) {
            zoo.add(i, array[i]);
        }
        System.out.println(zoo);
        zoo.remove(2);
        System.out.println(zoo);
        zoo.remove(3);
        System.out.println(zoo);
        zoo.remove(4);
        System.out.println(zoo);
        System.out.println("Розмір після видалення" + zoo.size());
        return zoo;
    }
}







