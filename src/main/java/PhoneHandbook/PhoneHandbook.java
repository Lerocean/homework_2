package PhoneHandbook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneHandbook {
    private final Map<String, Set<String>> handbook;

    public PhoneHandbook() {
        handbook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        Set<String> phoneNumbers = handbook.getOrDefault(surname, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        handbook.put(surname, phoneNumbers);
    }

    public Set<String> get(String surname) {
        return handbook.getOrDefault(surname, new HashSet<>());
    }

    public static void main(String[] args) {
        PhoneHandbook phoneHandbook = new PhoneHandbook();
        phoneHandbook.add("Иванов", "111111111");
        phoneHandbook.add("Петров", "222222222");
        phoneHandbook.add("Иванов", "333333333");

        System.out.println(phoneHandbook.get("Иванов"));
        System.out.println(phoneHandbook.get("Петров"));
        System.out.println(phoneHandbook.get("Антонов"));
    }
}
