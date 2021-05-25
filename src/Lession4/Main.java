package Lession4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массив с набором имён");

        List<String> strArr = new ArrayList<>(Arrays.asList(
                "Marta", "Vlad", "Kira", "Semen", "Albert",
                "Viktor", "Konstantin", "Marta", "Semen", "Misha",
                "Vladimir", "Albert", "Marta", "Angelina", "Galina",
                "Abraham", "Denis", "Misha", "Inna", "Yana"
        ));
        System.out.println("Весь массив: " + strArr);

        Set<String> unicArr = new HashSet<>(strArr);
        System.out.println("Список уникальных имён: " + unicArr);

        Map<String, Integer> sumArr = new HashMap<>();
        for (String s : strArr) {
            int val = sumArr.getOrDefault(s, 0) + 1;
            sumArr.put(s, val);
        }
        System.out.println("Сколько раз встречается каждое имя: " + sumArr);

        System.out.println();
        System.out.println("Телефонный справочник");

        Contacts contacts = new Contacts();

        contacts.add("Linkoln", "+798912345");
        contacts.add("Linkoln", "+798923456");
        contacts.add("Eltsin", "+798934567");
        contacts.add("El_chapo", "+798945678");
        contacts.add("El_chapo", "+798956789");
        contacts.add("El_chapo", "+798967890");
        contacts.add("Bismark", "+798978901");
        contacts.add("Ptushkin", "+798989012");
        contacts.add("Messi", "+798990123");

        System.out.println("Linkoln: " + contacts.get("Linkoln"));
        System.out.println("Eltsin: " + contacts.get("Eltsin"));
        System.out.println("El_chapo: " + contacts.get("El_chapo"));
        System.out.println("Bismark: " + contacts.get("Bismark"));
        System.out.println("Ptushkin: " + contacts.get("Ptushkin"));
        System.out.println("Messi: " + contacts.get("Messi"));
    }
}
