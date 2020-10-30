import java.util.*;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("James", "+3243443");
        phoneBook.add("Tim", "+34534234234");
        phoneBook.add("James", "+4345345");
        phoneBook.add("Linda", "+344534435");

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("James"));


    }
    static void doTask1() {
        List<String> words = new ArrayList<>(Arrays.asList("table", "glass", "phone", "glass", "bed", "table", "glass",
                "computer", "cover", "cover"));
        System.out.println("В начале массив");
        System.out.println(words.toString());
        System.out.println("После: ");
        Set<String> unicWord = new LinkedHashSet<>(words);
        for(String word : unicWord){
            System.out.println(word);
        }
        System.out.println("=====");
        System.out.println("table : " + Collections.frequency(words, "table"));
        System.out.println("glass : " + Collections.frequency(words, "glass"));
        System.out.println("phone : " + Collections.frequency(words, "phone"));
        System.out.println("bed : " + Collections.frequency(words, "bed"));
        System.out.println("computer : " + Collections.frequency(words, "computer"));
        System.out.println("cover : " + Collections.frequency(words, "cover"));
    }

}

