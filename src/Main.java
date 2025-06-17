import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"소주련", "소", "주", "련"};

        for (String n: names) {
            System.out.println(n);
        }

        Arrays.stream(names).forEach(name -> System.out.println(name));
        Arrays.stream(names).forEach(System.out::println);
    }
}