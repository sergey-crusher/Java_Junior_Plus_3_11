import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(13);
        numbers.add(2);

        ArrayList<String> names = new ArrayList<>();
        names.add("Sergey");
        names.add("Nataliya");
        names.add("Vselen");
        names.add("Andrey");
        names.add("Andjelika");

        ArrayList<String> combines = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            combines.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String combine : combines) {
            System.out.println(combine);
        }
    }
}